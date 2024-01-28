package SimpleRhythmGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class Database {
	public static int insertScore(Level level, PlayerData playerData, Scores scores) {
		if (!Main.getConfig().getDatabaseDNS().equals("null") && !Main.getConfig().getDatabasePasskey().equals("null")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://" + Main.getConfig().getDatabaseDNS() + ":3306/leaderboard", 
						"root", Main.getConfig().getDatabasePasskey());
				Statement stmt = con.createStatement();
				String levelName = level.getName();
				String levelUUID = level.getUUID().toString();
				String username = playerData.getUsername();
				String userUUID = playerData.getUUID().toString();
				int score = scores.getScore();
				float accuracy = scores.getAccuracy();
				int maxCombo = scores.getMaxCombo();
				String sql = "insert into leaderboard (levelName, levelUUID, username, userUUID,"
						+ "score, accuracy, maxCombo) values ( \"" + levelName + "\", \"" + levelUUID + "\","
						+ "\"" + username + "\", \"" + userUUID + "\", " + score + ", " + accuracy + ", "
						+ maxCombo + ");";
				stmt.executeUpdate(sql);
				return 1;
			} catch (Exception e) {
				System.out.println(e);
				if (e.getMessage().length() > 12) {
					if (e.getMessage().substring(0,13).equals("Access denied")) {
						// System.out.println("Access was denied");
						return -2; // Access error
					}
				}
				return -1; // Generic error
			}
		} else {
			return -3; // No Access Attempt
		}
	}
	
	public static int getOldHighscore(Level level, UUID uuid) {
		if (!Main.getConfig().getDatabaseDNS().equals("null") && !Main.getConfig().getDatabasePasskey().equals("null")) {
			String levelUUID = level.getUUID().toString();
			String userUUID = uuid.toString();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://" + Main.getConfig().getDatabaseDNS() + ":3306/leaderboard", 
						"root", Main.getConfig().getDatabasePasskey());
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT userUUID, levelUUID, score FROM `leaderboard`.`leaderboard`"
						+ "WHERE userUUID = \'" + userUUID + "\' AND levelUUID = \'" + levelUUID + "\';");
				int score = -1;
				if (rs.next()) {
					score = rs.getInt("score");
				} else {
					return -1;
				}
				con.close();
				return score;
			} catch (SQLException | ClassNotFoundException e) {
				System.out.println(e);
				if (e.getMessage().length() > 12) {
					if (e.getMessage().substring(0,13).equals("Access denied")) {
						// System.out.println("Access was denied");
						return -2;
					}
				}
				return -1;
			}
		} else {
			return -3;
		}
	}
	
	public static int updateOldHighscore(Level level, PlayerData playerData, Scores scores) {
		if (!Main.getConfig().getDatabaseDNS().equals("null") && !Main.getConfig().getDatabasePasskey().equals("null")) {
			if (getOldHighscore(level, playerData.getUUID()) > 0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String userUUID = playerData.getUUID().toString();
					String levelUUID = level.getUUID().toString();
					Connection con = DriverManager.getConnection("jdbc:mysql://" + Main.getConfig().getDatabaseDNS() + ":3306/leaderboard",
							"root", Main.getConfig().getDatabasePasskey());
					Statement stmt = con.createStatement();
					stmt.executeUpdate("UPDATE leaderboard SET score = " + scores.getScore() + ", accuracy = " + 
					scores.getAccuracy() + ", maxCombo = " + scores.getMaxCombo() + " WHERE userUUID = \'" + 
							userUUID + "\' AND levelUUID = \'" + levelUUID + "\' AND score < " + scores.getScore() + ";");
					con.close();
					return 1;
				} catch (SQLException | ClassNotFoundException e) {
					System.out.println(e);
					if (e.getMessage().length() > 12) {
						if (e.getMessage().substring(0,13).equals("Access denied")) {
							// System.out.println("Access was denied");
							return -1; // Access error
						}
					}
					return -2; // Generic error
				}
			} else {
				return insertScore(level, playerData, scores);
			}
		} else {
			return -3;
		}
	}
	
	public static DatabaseData readDatabase(Level level) {
		if (!Main.getConfig().getDatabaseDNS().equals("null") && !Main.getConfig().getDatabasePasskey().equals("null")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://" + Main.getConfig().getDatabaseDNS() + ":3306/leaderboard",
						"root", Main.getConfig().getDatabasePasskey());
				Statement stmt = con.createStatement();
				ResultSet countRS = stmt.executeQuery("SELECT COUNT(*) FROM `leaderboard`.`leaderboard`"
						+ "WHERE levelUUID = \'" + level.getUUID().toString() + "\' LIMIT 10;");
				countRS.next();
				int length = countRS.getInt(1);
				ResultSet rs = stmt.executeQuery("SELECT username, score, accuracy, maxCombo FROM `leaderboard`.`leaderboard`"
						+ "WHERE levelUUID = \'" + level.getUUID().toString() + "\' ORDER BY "
								+ "score DESC LIMIT 10;");
				DatabaseData data = new DatabaseData(length);
				for (int i = 0 ; i < length ; i++) {
					rs.next();
					data.setIndex(i, rs.getString("username"), rs.getInt("score"),
							rs.getFloat("accuracy"), rs.getInt("maxCombo"));
				}
				con.close();
				return data;
			} catch (SQLException | ClassNotFoundException e) {
				System.out.println(e);
				if (e.getMessage().length() > 12) {
					if (e.getMessage().substring(0,13).equals("Access denied")) {
						// System.out.println("Access was denied");
						return new DatabaseData(false);
					}
				}
				return null;
			}
		} else {
			return null;
		}
	}
}

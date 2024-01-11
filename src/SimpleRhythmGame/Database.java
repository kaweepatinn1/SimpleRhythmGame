package SimpleRhythmGame;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class Database {
	public static void insertScore(Level level, PlayerData playerData, Scores scores) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaderboard", "root", "root2212");
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
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static int getOldHighscore(Level level, UUID uuid) {
		String levelUUID = level.getUUID().toString();
		String userUUID = uuid.toString();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaderboard", "root", "root2212");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT userUUID, levelUUID, score FROM `leaderboard`.`leaderboard`"
					+ "WHERE userUUID = \'" + userUUID + "\' AND levelUUID = \'" + levelUUID + "\';");
			int score = -1;
			if (rs != null) {
				rs.next();
				score = rs.getInt(5);
			} else {
				return -1;
			}
			con.close();
			return score;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
			return -1;
		}
	}
	
	public static void updateOldHighscore(Level level, PlayerData playerData, Scores scores) {
		if (getOldHighscore(level, playerData.getUUID()) > -1) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String userUUID = playerData.getUUID().toString();
				String levelUUID = level.getUUID().toString();
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaderboard", "root", "root2212");
				Statement stmt = con.createStatement();
				stmt.executeUpdate("UPDATE leaderboard SET score = " + scores.getScore() + " WHERE userUUID = \'" + 
						userUUID + "\' AND levelUUID = \'" + levelUUID + "\' AND score < " + scores.getScore() + ";");
				con.close();
			} catch (SQLException | ClassNotFoundException e) {
				System.out.println(e);
			}
		} else {
			insertScore(level, playerData, scores);
		}
	}
	
	public static int getResultSetLength(ResultSet rs) {
		if (rs != null) {
			try {
				int row = rs.getRow();
				rs.last();
				int length = rs.getRow();
				rs.first();
				for (int i = 1 ; i < row ; i++) {
					rs.next();
				}
				return length;
			} catch (SQLException e) {
				System.out.println(e);
				return -1;
			}
		} else {
			return 0;
		}
	}

	static int newkey(String table) {
		int returnkey = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaderboard", "root", "root2212");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM " + table);
			rs.next();
			returnkey = rs.getInt(1) + 1;
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return returnkey;
	}

}

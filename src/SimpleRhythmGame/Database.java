package SimpleRhythmGame;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class Database {
	public static void main(String[] args) {
		SysOutController.setSysOutLocationAddressor(); // FOR DEBUGGING (TODO: can be disabled)
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaderboard", "root", "root2212");
			Statement stmt = con.createStatement();
			// query
			// ResultSet rs = stmt.executeQuery("select * from table1");
			// while (rs.next())
			// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
			// rs.getInt(3));
			// con.close();

			// insert
			getOldHighscore();
			int n = newkey("leaderboard");
			System.out.println(n);
			String levelName = "LevelName";
			String levelUUID = "levelUUID";
			String username = "Username";
			String userUUID = "userUUID";
			int score = 144;
			float accuracy = 50.2f;
			int maxCombo = 40;
			String sqlInsert = "insert into leaderboard (levelName, levelUUID, username, userUUID,"
					+ "score, accuracy, maxCombo) values ( \"" + levelName + "\", \"" + levelUUID + "\","
					+ "\"" + username + "\", \"" + userUUID + "\", " + score + ", " + accuracy + ", "
					+ maxCombo + ");";
			System.out.println("The SQL statement is: " + sqlInsert + "\n"); // Echo for debugging
			int countInserted = stmt.executeUpdate(sqlInsert);
			System.out.println(countInserted + " records inserted.\n");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	//Level level, UUID uuid
	public static int getOldHighscore() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String userUUID = "userUUID";
			String levelUUID = "levelUUID";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/leaderboard", "root", "root2212");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT userUUID, levelUUID FROM `leaderboard`.`leaderboard`"
					+ "WHERE userUUID = \'" + userUUID + "\' AND levelUUID = \'" + levelUUID + "\';");
			
			rs.next();
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}
		return 1;
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

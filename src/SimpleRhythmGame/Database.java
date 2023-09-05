package SimpleRhythmGame;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "a";
		int score = 10;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root2212");
			Statement stmt = con.createStatement();
			// query
			// ResultSet rs = stmt.executeQuery("select * from table1");
			// while (rs.next())
			// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
			// rs.getInt(3));
			// con.close();

			// insert
			int n = newkey("new_table");
			System.out.println(n);
			String sqlInsert = "insert into new_table values (" + n + ", \"" + name + "\", " + score + ")";
			System.out.println("The SQL statement is: " + sqlInsert + "\n"); // Echo for debugging
			int countInserted = stmt.executeUpdate(sqlInsert);
			System.out.println(countInserted + " records inserted.\n");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	static int newkey(String table) {
		int returnkey = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root2212");
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

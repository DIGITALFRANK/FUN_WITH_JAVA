package JDBC_CreateDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String pass = "P@ssww0rd19";
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(url, user, pass);
			
			stmt = conn.createStatement();
			String sql = "CREATE DATABASE STUDENTS";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
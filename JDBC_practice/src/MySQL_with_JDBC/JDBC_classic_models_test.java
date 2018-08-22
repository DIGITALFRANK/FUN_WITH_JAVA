package MySQL_with_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC_classic_models_test {

	public static void main(String[] args) {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		String url = "jdbc:mysql://localhost:3306/classicmodels?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//		String user = "root";
//		String password = "password";
		
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "P@ssww0rd19");
		
		
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			
//			myConn = DriverManager.getConnection(url, user, password);
			myConn = DriverManager.getConnection(url, info);
			
			System.out.println("Database connection successful!\n");
			
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery("Select * from customers where state='NY'");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("contactLastName") + ", " + myRs.getString("contactFirstName"));
			}
		} 
//		catch (SQLException ex) {
//			System.out.println("Error: No suitable driver found!");
//			System.exit(1);
//		} 
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}









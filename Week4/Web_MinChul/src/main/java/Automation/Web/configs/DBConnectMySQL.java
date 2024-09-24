<<<<<<< HEAD
package Automation.Web.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectMySQL {

	private static String DRIVER = "com.mysql.cj.jdbc.Driver"; 
	private static String URL = "jdbc:mysql://localhost:3306/sql_automation";
	private static String USERNAME = "root";
	private static String PASSWORD = "Trungtoresst9";

	public static Connection getDatabaseConnection() throws SQLException, Exception{
		
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			new DBConnectMySQL ();
			System.out.println(DBConnectMySQL.getDatabaseConnection());
			System.out.println("Connected to MySQL_ MinChulAutomation");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
=======
package Automation.Web.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectMySQL {

	private static String DRIVER = "com.mysql.cj.jdbc.Driver"; 
	private static String URL = "jdbc:mysql://localhost:3306/sql_automation";
	private static String USERNAME = "root";
	private static String PASSWORD = "Trungtoresst9";

	public static Connection getDatabaseConnection() throws SQLException, Exception{
		
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			new DBConnectMySQL ();
			System.out.println(DBConnectMySQL.getDatabaseConnection());
			System.out.println("Connected to MySQL_ MinChulAutomation");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
>>>>>>> 8c1f23247e42ea9e6c00a664fd37eba6dc83c1d7

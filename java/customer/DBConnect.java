package customer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//private static String url = "jdbc:mysql://localhost:3306/bank_oop";
	private static String url="jdbc:mysql://localhost:3306/bank_oop?autoReconnect=true&useSSL=false";
	private static String userName = "root";
	private static String password = "12345";
	private static Connection con;

	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Database connection is successful!!!");
			
		}
		catch (Exception e) {
			System.out.println("Database connection is not success!!!");
		}
		
		return con;
	}
}

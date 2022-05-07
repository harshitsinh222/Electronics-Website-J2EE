package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	private static Connection connection;
	
	// Create a Static method to return a DB connection
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
		}
		return connection;
	}

}

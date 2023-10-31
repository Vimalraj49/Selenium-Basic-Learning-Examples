package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MySqlConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_users");
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("SELECT * FROM superheros_table");
		
		while(result.next()) {
			
			System.out.println("Name: " +result.getString(1));
			System.out.println("Nickname: "+result.getString(2));
		}
		
	}

}

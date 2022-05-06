package BusinessLayer.DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {


	/**
	 * @see projet.BusinessLayer.DAOLayer.ConnectionBD#getConnection(String, String, String, String)
	 */
	public static Connection getConnection(String host, String bd, String username, String pass) {
		String url = "jdbc:mysql://"+host+":3306/"+bd;
		Connection connection = null;

		try
		 {
			//loading the jdbc driver
			//get a connection to database
			connection = DriverManager.getConnection(url, username, pass);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}

}

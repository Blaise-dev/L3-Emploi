package BusinessLayer.DAOLayer;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Requete {

	static ResultSet rs = null;
	static String host = "localhost";
	static String bd = "tp_emploi";
	static String user = "root";
	static String pass = "";
	static Connection connection = null;
	
	/**
	 * @see BusinessLayer.DAOLayer.Requete#executeQuery(String)
	 */
	public static void executeQuery(String req) {
		connection = ConnectionBD.getConnection(host, bd, user, pass);

		try
		{
			//create a statement
			Statement stmt=connection.createStatement();
			//execute sql query
			rs=stmt.executeQuery(req);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	/**
	 * @see BusinessLayer.DAOLayer.Requete#next()
	 */
	public static boolean next() {

		boolean suivant = false;
		try
		{
			suivant = rs.next();
			if(!suivant)
				connection.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return suivant;
	}

	
	/**
	 * @see BusinessLayer.DAOLayer.Requete#getString(String)
	 */
	public static String getString(String colonne) {

		String value = "";
		try
		{
			value = rs.getString(colonne);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
	}


	/**
	 * @see BusinessLayer.DAOLayer.Requete#executeUpdate(String)
	 */
	public static void executeUpdate(String req) {
		connection = ConnectionBD.getConnection(host, bd, user, pass);

		try
		 {
			//create a statement
			Statement stmt=connection.createStatement();
			//execute sql query
			stmt.executeUpdate(req);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

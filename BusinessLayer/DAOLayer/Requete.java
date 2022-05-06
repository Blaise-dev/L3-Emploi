package BusinessLayer.DAOLayer;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Requete {

	static protected ResultSet rs = null;
	static protected final String host = "localhost";
	static protected final String bd = "tp_emploi";
	static protected final String user = "root";
	static protected final String pass = "";
	static protected Connection connection = null;
	
	/**
	 * @see projet.BusinessLayer.DAOLayer.Requete#executeQuery(String)
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
	 * @see projet.BusinessLayer.DAOLayer.Requete#next()
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
	 * @see projet.BusinessLayer.DAOLayer.Requete#getString(String)
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
	 * @see projet.BusinessLayer.DAOLayer.Requete#executeUpdate(String)
	 */
	public void executeUpdate(String req) {
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

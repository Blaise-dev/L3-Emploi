import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/tp_bd";
		String username = "root";
		String pass = "";
		try
		 {
			//loading the jdbc driver
			//get a connection to database
			Connection connection = DriverManager.getConnection(url, username, pass);
			//create a statement
			Statement stmt=connection.createStatement();
			//execute sql query
			ResultSet rs=stmt.executeQuery("select * from etudiant");
			while(rs.next())
			{
				System.out.println(rs.getString("nom")+" = "+rs.getString(1));
			}
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
}
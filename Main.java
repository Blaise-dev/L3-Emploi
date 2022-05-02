import BusinessLayer.DAOLayer.Requete;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Utilisateur");
		while(request.next())
		{
			System.out.println(request.getString("matricule")+" :: "+request.getString("nom"));
		}
		//Requete.executeUpdate("UPDATE Utilisateur SET matricule='18M4687' WHERE matricule='15P4574'");
		//rs = Requete.executeQuery("SELECT * FROM Etudiant");
		//Requete.executeUpdate("INSERT INTO Utilisateur VALUES ('19Q2348', 'Landry', 'land56', 'Aurel', 'Yann', 'landryyan12@yahoo.fr', '2000/02/12')");
	}
}
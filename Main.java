import BusinessLayer.Etudiant;
import BusinessLayer.Utilisateur;
import BusinessLayer.DAOLayer.*;
import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		Requete request = new Requete();
//		request.executeQuery("SELECT * FROM Utilisateur");
//		while(request.next())
//		{
//			System.out.println(request.getString("matricule")+" :: "+request.getString("nom"));
//		}
		//Requete.executeUpdate("UPDATE Utilisateur SET matricule='18M4687' WHERE matricule='15P4574'");
		//rs = Requete.executeQuery("SELECT * FROM Etudiant");
		//Requete.executeUpdate("INSERT INTO Utilisateur VALUES ('19Q2348', 'Landry', 'land56', 'Aurel', 'Yann', 'landryyan12@yahoo.fr', '2000/02/12')");
		IEtudiant etd = new Etudiant();
		etd.setMatricule("19W4571");
		ISelectDAO select = new SelectDAO();
		select.selEtudiant(etd);
                ArrayList<HashMap<String, String>> suivis = select.selSuiviEtudiant(etd);
		System.out.println(etd.getNom()+" "+etd.getPrenom());
                System.out.println(suivis);
	}
}
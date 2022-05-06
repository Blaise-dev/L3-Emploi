import BusinessLayer.Etudiant;
import BusinessLayer.Utilisateur;
import BusinessLayer.DAOLayer.*;
import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;

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
		etd.setMatricule("18T2510");
		ISelectDAO select = new SelectDAO();
		select.selEtudiant(etd);
		System.out.print(etd.getNom()+" "+etd.getPrenom());
	}
}
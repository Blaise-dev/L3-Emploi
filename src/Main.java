import BusinessLayer.Etudiant;
import BusinessLayer.Utilisateur;
import BusinessLayer.DAOLayer.*;
import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;
import BusinessLayer.SuiviCours;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
                etd.connecter("18T2510", "cabrel235");
                etd.fillEtd(etd);
                ISelectDAO select = new SelectDAO();
                ArrayList<IEtudiant> res = select.selComrades(etd);
                for(IEtudiant etu: res) {
                    System.out.println(etu.getNom() + " - " + etu.getMatricule());
                }
	}
}
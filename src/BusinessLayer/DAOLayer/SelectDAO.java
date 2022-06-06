package BusinessLayer.DAOLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.Enseignant;
import BusinessLayer.Etudiant;

import java.util.ArrayList;
import java.util.HashMap;

import BusinessLayer.InterfacesBusiness.*;

public class SelectDAO implements ISelectDAO {

	public boolean exist(String table, String colonne, String valeurColonne){

		Requete request = new Requete();
		int nbr = 0;

		request.executeQuery(
				"SELECT COUNT(*) nbr FROM " + table + " WHERE " + colonne + " = '" + valeurColonne + "'");
		while (request.next()) {
                    nbr = Integer.parseInt(request.getString("nbr"));
		}
		return nbr != 0;
	}

	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selPass(String)
	 */
	public void selUser(IUtilisateur usr) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Utilisateur WHERE matricule='"+usr.getMatricule()+"'");
		while(request.next()) {
                    usr.setNom(request.getString("nom"));
                    usr.setPrenom(request.getString("prenom"));
                    usr.setMdp(request.getString("mdp"));
                    usr.setEmail(request.getString("email"));
                    usr.setDateNais(request.getString("dateNais"));
                    usr.setType(request.getString("type"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSalle(ISalle)
	 */
	public void selSalle(ISalle salle) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Salle WHERE codeSalle='"+salle.getCodeSalle()+"'");
		while(request.next()) {
                    salle.setNomSalle(request.getString("nomSalle"));
                    salle.setType(request.getString("typeSalle"));
                    salle.setCapacite(Integer.parseInt(request.getString("capacite")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selFiliere(IFiliere)
	 */
	public void selFiliere(IFiliere filiere) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Filiere WHERE codeFiliere='"+filiere.getCodeFil()+"'");
		while(request.next()) {
                    filiere.setNomFil(request.getString("nomFiliere"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selGroupe(IGroupe)
	 */
	public void selGroupe(IGroupe groupe) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Groupe WHERE idGrp='"+groupe.getIdGrp()+"'");
		while(request.next()) {
                    groupe.setNomGrp(request.getString("groupeClass"));
                    groupe.setEffectifGrp(Integer.parseInt(request.getString("effectif")));
                    groupe.setIdNiveau(Integer.parseInt(request.getString("idNiveau")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selNiveau(INiveau)
	 */
	public void selNiveau(INiveau niveau) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Niveau WHERE idNiveau='"+niveau.getIdNiv()+"'");
		while(request.next()) {
                    niveau.setCodeNiv(request.getString("codeNiveau"));
                    niveau.setNomNiv(request.getString("nomNiveau"));
                    niveau.setCodeFiliere(request.getString("codeFiliere"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSemestre(ISemestre)
	 */
	public void selSemestre(ISemestre semestre) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Semestre WHERE idSem='"+semestre.getIdSem()+"'");
		while(request.next()) {
                    semestre.setCodeSem(request.getString("codeSemestre"));
                    semestre.setNomSem(request.getString("nomSem"));
                    semestre.setIdAnnee(Integer.parseInt(request.getString("idAnnee")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAnnee(IAnnee)
	 */
	public void selAnnee(IAnnee annee) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Annee WHERE idAnnee='"+annee.getIdAnnee()+"'");
		while(request.next()) {
                    annee.setAnneeDebut(request.getString("anneeDebut"));
                    annee.setAnneeFin(request.getString("anneeFin"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selMatiere(IMatiere)
	 */
	public void selMatiere(IMatiere matiere) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Matiere WHERE codeMatiere='"+matiere.getCodeMat()+"'");
		while(request.next()) {
                    matiere.setIntituleMat(request.getString("intituleMatiere"));
                    matiere.setCodeDepartement(request.getString("codeDepartement"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selDepartement(IDepartement)
	 */
	public void selDepartement(IDepartement dpt) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Departement WHERE codeDepartement='"+dpt.getCodeDepart()+"'");
		while(request.next()) {
                    dpt.setNomDepart(request.getString("nomDepartement"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEnseignant(projet.BusinessLayer.IEnseignant)
	 */
	public void selEnseignant(IEnseignant ens) {
		selUser(ens);
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Enseignant WHERE matricule='"+ens.getMatricule()+"'");
		while(request.next()) {
                    ens.setGradeEns(request.getString("gradeEns"));
                    ens.setCodeDepartement(request.getString("codeDepartement"));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selAdministrateur(IAdministrateur)
	 */
	public void selAdministrateur(IAdministrateur admin) {
		selUser(admin);
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public void selEtudiant(IEtudiant etudiant) {
		selUser(etudiant);
		Requete request = new Requete();
		request.executeQuery("SELECT idGrp FROM Etudiant WHERE matricule='"+etudiant.getMatricule()+"'");
		while(request.next()) {
                    etudiant.setIdGrp(Integer.parseInt(request.getString("idGrp")));
		}
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public ArrayList<IEtudiant> selComrades(IEtudiant etudiant) {
		ArrayList<IEtudiant> comrades = new ArrayList<>();
		Etudiant etd;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Etudiant WHERE idGrp='"+etudiant.getIdGrp()+"'");
		while(request.next()) {
                    etd = new Etudiant();
                    etd.setMatricule(request.getString("matricule"));
                    etd.setIdGrp(Integer.parseInt(request.getString("idGrp")));
                    comrades.add(etd);
		}
                for(IEtudiant student: comrades)
                    student.fillEtd(student);

                return comrades;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSuiviEtudiant(IEtudiant)
	 */
	public ArrayList<HashMap<String, String>> selSuiviEtudiant(IEtudiant etudiant) {
		ArrayList<HashMap<String, String>> suivis = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> suivi = null;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM FaireCours WHERE idGrp='"+etudiant.getIdGrp()+"' ORDER BY jour ASC");
		while(request.next()) {
                    suivi = new HashMap<String, String>();
                    suivi.put("codeMatiere", request.getString("codeMatiere"));
                    suivi.put("matricule", request.getString("matricule"));
                    suivi.put("codeSalle", request.getString("codeSalle"));
                    suivi.put("idSem", request.getString("idSem"));
                    suivi.put("idGrp", request.getString("idGrp"));
                    suivi.put("heureDebut", request.getString("heureDebut"));
                    suivi.put("heureFin", request.getString("heureFin"));
                    suivi.put("jour", request.getString("jour"));

			// On ajoute le suivi dans le ArrayList.
                    suivis.add(suivi);
		}
		return suivis;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selSuiviEnseignant(IEnseignant)
	 */
	public ArrayList<HashMap<String, String>> selSuiviEnseignant(IEnseignant enseignant) {
		ArrayList<HashMap<String, String>> suivis = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> suivi = null;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM FaireCours WHERE matricule='"+enseignant.getMatricule()+"'");
		while(request.next()) {
                    suivi = new HashMap<String, String>();
                    suivi.put("codeMatiere", request.getString("codeMatiere"));
                    suivi.put("matricule", request.getString("matricule"));
                    suivi.put("codeSalle", request.getString("codeSalle"));
                    suivi.put("idSem", request.getString("idSem"));
                    suivi.put("idGrp", request.getString("idGrp"));
                    suivi.put("heureDebut", request.getString("heureDebut"));
                    suivi.put("heureFin", request.getString("heureFin"));
                    suivi.put("jour", request.getString("jour"));

			// On ajoute le suivi dans le ArrayList.
                    suivis.add(suivi);
		}
		return suivis;
	}


	/**
	 * @see projet.BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public ArrayList<IEnseignant> selColleagues(IEnseignant enseignant) {
		ArrayList<IEnseignant> colleagues = new ArrayList<>();
		Enseignant ens;
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Enseignant WHERE codeDepartement='"+enseignant.getCodeDepartement()+"'");
		while(request.next()) {
                    ens = new Enseignant();
                    ens.setMatricule(request.getString("matricule"));
                    ens.setGradeEns(request.getString("gradeEns"));
                    ens.setCodeDepartement(request.getString("codeDepartement"));
                    colleagues.add(ens);
		}
                for(IEnseignant teacher: colleagues)
                    teacher.fillEns(teacher);

                return colleagues;
	}

}

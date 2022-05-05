package BusinessLayer.DAOLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.*;
import java.util.List;

import BusinessLayer.InterfacesBusiness.*;

public class SelectDAO implements ISelectDAO {

	public int exist(String table, String colonne, String valeurColonne){

		Requete request = new Requete();
		int nbr = 0;

		request.executeQuery(
				"SELECT COUNT(*) nbr FROM " + table + " WHERE " + colonne + " = " + valeurColonne + "");
		while (request.next()) {

			nbr = Integer.parseInt(request.getString("nbr"));
			
		}
		return nbr;
	}

	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selPass(String)
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
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selSalle(ISalle)
	 */
	public void selSalle(ISalle salle) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Salle WHERE codeSalle='"+salle.getCodeSalle()+"'");
		while(request.next()) {
			salle.setNomSalle(request.getString("nomSalle"));
			salle.setType(request.getString("typeSalle"));
			salle.setCapacite(request.getString("capacite"));
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selFiliere(IFiliere)
	 */
	public void selFiliere(IFiliere filiere) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Filiere WHERE codeFiliere='"+filiere.getCodeFil()+"'");
		while(request.next()) {
			filiere.setNomFil(request.getString("nomFiliere"));
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selGroupe(IGroupe)
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
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selNiveau(INiveau)
	 */
	public void selNiveau(INiveau niveau) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Niveau WHERE idNiveau='"+niveau.getIdNiv()+"'");
		while(request.next()) {
			niveau.setCodeNiv(request.getString("codeNiveau"));
			niveau.setNomNiv(request.getString("effectif"));
			niveau.setCodeFiliere(request.getString("codeFiliere"));
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selSemestre(ISemestre)
	 */
	public void selSemestre(ISemestre semestre) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Niveau WHERE idNiveau='"+semestre.getIdSem()+"'");
		while(request.next()) {
			semestre.setCodeSem(request.getString("codeSemestre"));
			semestre.setNomSem(request.getString("nomSem"));
			semestre.setIdAnnee(Integer.parseInt(request.getString("codeFiliere")));
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selAnnee(IAnnee)
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
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selMatiere(IMatiere)
	 */
	public void selMatiere(IMatiere matiere) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Matiere WHERE codeMatiere='"+matiere.getCodeMat()+"'");
		while(request.next()) {
			matiere.setIntituleMat(request.getString("intituleMatiere"));
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selDepartement(IDepartement)
	 */
	public void selDepartement(IDepartement dpt) {
		Requete request = new Requete();
		request.executeQuery("SELECT * FROM Departement WHERE codeDepartement='"+dpt.getCodeDepart()+"'");
		while(request.next()) {
			dpt.setNomDepart(request.getString("nomDepartement"));
		}
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selEnseignant(BusinessLayer.IEnseignant)
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
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selAdministrateur(IAdministrateur)
	 */
	public void selAdministrateur(IAdministrateur admin) {
		selUser(admin);
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selEtudiant(IEtudiant)
	 */
	public void selEtudiant(IEtudiant etudiant) {
		selUser(etudiant);
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selSuiviEtudiant(IEtudiant)
	 */
	public List<?> selSuiviEtudiant(IEtudiant etudiant) {
		return null;
	}


	/**
	 * @see BusinessLayer.DAOLayer.ISelectDAO#selSuiviEnseignant(IEnseignant)
	 */
	public List<?> selSuiviEnseignant(IEnseignant enseignant) {
		return null;
	}

}

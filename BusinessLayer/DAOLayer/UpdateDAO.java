package BusinessLayer.DAOLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;

public class UpdateDAO implements IUpdateDAO {


	/**
	 * @see BusinessLayer.IUpdateDAO#updPass(IUtilisateur)
	 *  
	 */
	public void updUser(IUtilisateur usr) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Utilisateur "
				+ "SET nomUsr='"+usr.getNom()+"',"
					+ "nom='"+usr.getPrenom()+"',"
					+ "prenom='"+usr.getPrenom()+"',"
					+ "email='"+usr.getEmail()+"',"
					+ "dateNais='"+usr.getDateNais()+"',"
					+ ""
						+ "WHERE matricule='"+usr.getMatricule()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updSalle(ISalle)
	 */
	public void updSalle(ISalle salle) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Salle "
				+ "SET nomSalle='"+salle.getNomSalle()+"',"
					+ "typeSalle='"+salle.getType()+"',"
					+ "capacite='"+salle.getCapacite()+"',"
						+ "WHERE codeSalle='"+salle.getCodeSalle()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updFiliere(IFiliere)
	 *  
	 */
	public void updFiliere(IFiliere filiere) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Filiere "
				+ "SET nomFiliere='"+filiere.getNomFil()+"',"
						+ "WHERE codeFiliere='"+filiere.getCodeFil()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updGroupe(IGroupe, INiveau)
	 *  
	 */
	public void updGroupe(IGroupe groupe) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Groupe "
				+ "SET groupeClass='"+groupe.getCodeGrp()+"',"
						+ "nomGroupe='"+groupe.getNomGrp()+"',"
						+ "effectif='"+groupe.getEffectifGrp()+"',"
						+ "idNiveau='"+groupe.getNiveau().getIdNiv()+"',"
						+ "WHERE idGrp='"+groupe.getIdGrp()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updNiveau(INiveau)
	 *  
	 */
	public void updNiveau(INiveau niveau) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Niveau "
				+ "SET codeNiveau='"+niveau.getCodeNiv()+"',"
						+ "nomNiveau='"+niveau.getNomNiv()+"',"
						+ "codeFiliere='"+niveau.getFiliere().getCodeFil()+"',"
						+ "WHERE idNiveau='"+niveau.getIdNiv()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updSemestre(ISemestre)
	 *  
	 */
	public void updSemestre(ISemestre semestre) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Semestre "
				+ "SET codeSemestre='"+semestre.getCodeSem()+"',"
						+ "nomSemestre='"+semestre.getNomSem()+"',"
						+ "idAnnee='"+semestre.getAnnee().getIdAnnee()+"',"
						+ "WHERE idSemestre='"+semestre.getIdSem()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updAnnee(IAnnee)
	 *  
	 */
	public void updAnnee(IAnnee annee) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Annee "
				+ "SET anneeDebut='"+annee.getAnneeDebut()+"',"
					+ "anneeFin='"+annee.getAnneeFin()+"',"
						+ "WHERE idAnnee='"+annee.getIdAnnee()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updMatiere(IMatiere)
	 *  
	 */
	public void updMatiere(IMatiere matiere) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Matiere "
				+ "SET intituleMatiere='"+matiere.getIntituleMat()+"',"
						+ "WHERE codeMatiere='"+matiere.getCodeMat()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updDepartement(IDepartement)
	 *  
	 */
	public void updDepartement(IDepartement dpt) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Departement "
				+ "SET nomDepartement='"+dpt.getNomDepart()+"',"
						+ "WHERE codeDepartement='"+dpt.getCodeDepart()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updEnseignant(BusinessLayer.IEnseignant)
	 *  
	 */
	public void updEnseignant(IEnseignant ens) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Enseignant "
				+ "SET gradeEns='"+ens.getGradeEns()+"',"
						+ "codeDepartement='"+ens.getDepartement().getCodeDepart()+"',"
						+ "WHERE matricule='"+ens.getMatricule()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updAdministrateur(IAdministrateur)
	 *  
	 */
	public void updAdministrateur(IAdministrateur admin) {

	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updEtudiant(IEtudiant)
	 *  
	 */
	public void updEtudiant(IEtudiant etudiant) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE Etudiant "
				+ "SET idGrp='"+etudiant.getIdGrp()+"',"
						+ "WHERE matricule='"+etudiant.getMatricule()+"'"
				+ "");
	}


	/**
	 * @see BusinessLayer.DAOLayer.IUpdateDAO#updSuivi(ISuiviCours)
	 *  
	 */
	public void updSuivi(ISuiviCours suiviCours) {
		Requete req = new Requete();
		req.executeUpdate(""
				+ "UPDATE FaireCours "
				+ "SET jour='"+suiviCours.getJour()+"',"
						+ "heureDebut='"+suiviCours.getHeureDebut()+"',"
						+ "heureFin='"+suiviCours.getHeureFin()+"',"
						+ "WHERE codeSalle='"+suiviCours.getSalle().getCodeSalle()+"' "
						+ "AND matricule='"+suiviCours.getEnseignant().getMatricule()+"' "
						+ "AND codeMatiere='"+suiviCours.getMatiere().getCodeMat()+"' "
						+ "AND idGrp='"+suiviCours.getGroupe().getIdGrp()+"' "
						+ "AND idSem='"+suiviCours.getSemestre().getIdSem()+"' "
				+ "");
	}

}

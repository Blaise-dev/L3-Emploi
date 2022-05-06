package BusinessLayer.DAOLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;

public class InsertDAO implements IInsertDAO {

	public void insertUser(IUtilisateur user) {

		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Utilisateur", "matricule", user.getMatricule())) {
			Requete insertRequest = new Requete();
	
			insertRequest.executeUpdate("INSERT INTO Utilisateur VALUES ('" +
					user.getMatricule() + "', '" +
					user.getMdp() + "','" +
					user.getNom() + "', '" +
					user.getPrenom() + "', '" +
					user.getEmail() + "', '" +
					user.getDateNais() + "')");
		}

	}

	/**
	 * @see BusinessLayer.DAOLayer.IInsertDAO#insertSuivi(ISuiviCours)
	 */
	public void insertSuivi(ISuiviCours suivi) {

		insertSalle(suivi.getSalle());
		insertEnseignant(suivi.getEnseignant());
		insertMatiere(suivi.getMatiere());
		insertGroupe(suivi.getGroupe());
		insertSemestre(suivi.getSemestre());
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO fairecours VALUES('" +
				suivi.getSalle().getCodeSalle() + "', '" +
				suivi.getEnseignant().getMatricule() + "', '" +
				suivi.getMatiere().getCodeMat() + "', " +
				suivi.getGroupe().getIdGrp() + ", " +
				suivi.getSemestre().getIdSem() + ", '" +
				suivi.getJour() + "', '" +
				suivi.getHeureDebut() + "', '" +
				suivi.getHeureFin() + "')");

	}

	/**
	 * @see projet.BusinessLayer.DAOLayer.IInsertDAO#insertEtudiant(IEtudiant)
	 */
	public void insertEtudiant(IEtudiant etudiant) {
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Utilisateur", "matricule", etudiant.getMatricule()))
			insertUser(etudiant);
		if(!selection.exist("Etudiant", "matricule", etudiant.getMatricule())) {
			Requete insRequest = new Requete();
			insRequest.executeUpdate("INSERT INTO etudiant VALUES('" +
					etudiant.getMatricule() + "', '" +
					etudiant.getGroupe().getIdGrp() + "')");
		}

	}

	/**
	 * @see projet.BusinessLayer.DAOLayer.IInsertDAO#insertEnseignant(projet.BusinessLayer.IEnseignant)
	 */
	public void insertEnseignant(IEnseignant ens) {
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Utilisateur", "matricule", ens.getMatricule()))
			insertUser(ens);
		if(!selection.exist("Enseignant", "matricule", ens.getMatricule())) {
			Requete insRequest = new Requete();
			insRequest.executeUpdate("INSERT INTO enseignant VALUES('" +
					ens.getMatricule() + "', '" +
					ens.getGradeEns() + "', '" +
					ens.getDepartement().getCodeDepart()+"')");
		}

	}

	@Override
	public void insertSalle(ISalle salle) {
		
		// TODO Auto-generated method stub
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Salle", "codeSalle", salle.getCodeSalle())) {
			Requete insRequest = new Requete();
			insRequest.executeUpdate("INSERT INTO salle VALUES('" +
					salle.getCodeSalle() + "', '" +
					salle.getNomSalle() + "', '" +
					salle.getType() + "', " +
					salle.getCapacite() + ")");
		}
	}

	@Override
	public void insertFiliere(IFiliere filiere) {

		// TODO Auto-generated method stub
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Filiere", "codeFiliere", filiere.getCodeFil())) {
			Requete insRequest = new Requete();
			insRequest.executeUpdate("INSERT INTO filiere VALUES('" +
					filiere.getCodeFil() + "', '" +
					filiere.getNomFil() + "')");
		}
	}
	

	@Override
	public void insertGroupe(IGroupe grp) {

		// TODO Auto-generated method stub
		insertNiveau(grp.getNiveau());
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO groupe VALUES('" +
				grp.getCodeGrp() + "', '" +
				grp.getNomGrp() + "', " +
				grp.getEffectifGrp() + ", " +
				grp.getNiveau().getIdNiv()+")");
		
	}

	@Override
	public void insertNiveau(INiveau niveau) {

		// TODO Auto-generated method stub
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Filiere", "codeFiliere", niveau.getCodeFiliere()))
			insertFiliere(niveau.getFiliere());
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO niveau VALUES('" +
				niveau.getCodeNiv() + "', '" +
				niveau.getNomNiv() + "', '" +
				niveau.getFiliere().getCodeFil()+"')");
		
	}

	@Override
	public void insertSemestre(ISemestre semestre) {

		// TODO Auto-generated method stub
		insertAnnee(semestre.getAnnee());
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO semestre VALUES('" +
				semestre.getCodeSem() + "', '" +
				semestre.getNomSem() + "', " +
				semestre.getAnnee().getIdAnnee()+")");
		
	}

	@Override
	public void insertAnnee(IAnnee annee) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO annee VALUES('" +
				annee.getAnneeDebut() + "', '" +
				annee.getAnneeFin()+"')");
		
	}

	@Override
	public void insertMatiere(IMatiere matiere) {

		// TODO Auto-generated method stub
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Departement", "codeDepartement", matiere.getDepartement().getCodeDepart()))
			insertDepartement(matiere.getDepartement());
		Requete insRequest = new Requete();
		if(!selection.exist("Matiere", "codeMatiere", matiere.getCodeMat())) {
			insRequest.executeUpdate("INSERT INTO matiere VALUES('" +
					matiere.getCodeMat() + "', '" +
					matiere.getIntituleMat() + "', '" +
					matiere.getDepartement().getCodeDepart()+"')");
		}
		
	}

	@Override
	public void insertDepartement(IDepartement dpt) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO departement VALUES('" +
				dpt.getCodeDepart() + "', '" +
				dpt.getNomDepart()+"')");
		
	}

	@Override
	public void insertAdministrateur(IAdministrateur admin) {

		// TODO Auto-generated method stub
		ISelectDAO selection = new SelectDAO();
		if(!selection.exist("Utilisateur", "matricule", admin.getMatricule()))
			insertUser(admin);
		if(!selection.exist("Administrateur", "matricule", admin.getMatricule())) {
			Requete insRequest = new Requete();
			insRequest.executeUpdate("INSERT INTO administrateur VALUES('" +
					admin.getMatricule()+"')");
		}
		
	}


}

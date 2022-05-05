package BusinessLayer.DAOLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;

public class InsertDAO implements IInsertDAO {


	/**
	 * @see BusinessLayer.DAOLayer.IInsertDAO#insertLoginPass(String)
	 *  
	 */
	public void insertUser(IUtilisateur user) {

		Requete insertRequest = new Requete();

		insertRequest.executeUpdate("INSERT INTO Utilisateur VALUES ('" +
				user.getMatricule() + "', '" +
				user.getMdp() + "','" +
				user.getNom() + "', '" +
				user.getPrenom() + "', '" +
				user.getEmail() + "''" +
				user.getDateNais() + "')");

	}

	/**
	 * @see BusinessLayer.DAOLayer.IInsertDAO#insertSuivi(ISuiviCours)
	 */
	public void insertSuivi(ISuiviCours suivi) {

		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO fairecours VALUES('" +
				suivi.getSalle().getCodeSalle() + "', '" +
				suivi.getEnseignant().getMatricule() + "', '" +
				suivi.getMatiere().getCodeMat() + "', '" +
				suivi.getGroupe().getIdGrp() + "', '" +
				suivi.getSemestre().getIdSem() + "', '" +
				suivi.getJour() + "', '" +
				suivi.getHeureDebut() + "', '" +
				suivi.getHeureFin() + "')");

	}

	/**
	 * @see BusinessLayer.DAOLayer.IInsertDAO#insertEtudiant(IEtudiant)
	 */
	public void insertEtudiant(IEtudiant etudiant) {

		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO etudiant VALUES('" +
				etudiant.getMatricule() + "', '" +
				etudiant.getGroupe().getIdGrp() + "')");

	}

	/**
	 * @see BusinessLayer.DAOLayer.IInsertDAO#insertEnseignant(BusinessLayer.IEnseignant)
	 */
	public void insertEnseignant(IEnseignant ens) {

		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO enseignant VALUE('" +
				ens.getMatricule() + "', '" +
				ens.getGradeEns() + "', '" +
				ens.getDepartement().getCodeDepart()+"')");

	}

	@Override
	public void insertSalle(ISalle salle) {
		
		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO salle VALUES('" +
				salle.getCodeSalle() + "', '" +
				salle.getNomSalle() + "', '" +
				salle.getType() + "', " +
				salle.getCapacite() + ")");

	}

	@Override
	public void insertFiliere(IFiliere filiere) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO filiere VALUES('" +
				filiere.getCodeFil() + "', '" +
				filiere.getNomFil() + "')");

	}
	

	@Override
	public void insertGroupe(IGroupe grp) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO groupe VALUES(" +
				grp.getCodeGrp() + ", '" +
				grp.getNomGrp() + "', " +
				grp.getEffectifGrp() + ", " +
				grp.getNiveau().getIdNiv()+")");
		
	}

	@Override
	public void insertNiveau(INiveau nivveau) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO niveau VALUES(" +
				nivveau.getIdNiv() + ", '" +
				nivveau.getCodeNiv() + "', '" +
				nivveau.getNomNiv() + "', '" +
				nivveau.getFiliere().getCodeFil()+"')");
		
	}

	@Override
	public void insertSemestre(ISemestre semestre) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO semestre VALUES(" +
				semestre.getIdSem() + ",'" +
				semestre.getCodeSem() + "', '" +
				semestre.getNomSem() + "'," +
				semestre.getAnnee().getIdAnnee()+")");
		
	}

	@Override
	public void insertAnnee(IAnnee annee) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO annee VALUES(" +
				annee.getIdAnnee() + ", '" +
				annee.getAnneeDebut() + "', '" +
				annee.getAnneeFin()+"')");
		
	}

	@Override
	public void insertMatiere(IMatiere matiere) {

		// TODO Auto-generated method stub
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO matiere VALUES('" +
				matiere.getCodeMat() + "', '" +
				matiere.getIntituleMat()+"')");
		
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
		Requete insRequest = new Requete();
		insRequest.executeUpdate("INSERT INTO administrateur VALUES('"+admin.getMatricule()+"')");
		
	}


}

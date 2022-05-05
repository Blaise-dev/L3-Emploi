package BusinessLayer.DAOLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.*;
import BusinessLayer.InterfacesBusiness.*;

public class DeleteDAO implements IDeleteDAO {


	/**
	 * @see BusinessLayer.DAOLayer.IDeleteDAO#delSuivi(ISuiviCours)
	 */
	public void delSuivi(ISuiviCours suivi) {

		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM fairecours WHERE codeSalle = '" +
				suivi.getSalle().getCodeSalle() + "', '" +
				suivi.getEnseignant().getMatricule() + "', '" +
				suivi.getMatiere().getCodeMat() + "', '" +
				suivi.getGroupe().getIdGrp() + "', '" +
				suivi.getSemestre().getIdSem() + "', '" +
				suivi.getJour() + "', '" +
				suivi.getHeureDebut() + "', '" +
				suivi.getHeureFin()+"'");

	}


	/**
	 * @see BusinessLayer.DAOLayer.IDeleteDAO#delEnseignant(BusinessLayer.IEnseignant)
	 */
	public void delEnseignant(IEnseignant ens) {

		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM enseignant WHERE matricule = '"+ens.getMatricule()+"'");

	}


	/**
	 * @see BusinessLayer.DAOLayer.IDeleteDAO#delEtudiant(IEtudiant)
	 */
	public void delEtudiant(IEtudiant etudiant) {

		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM etudian WHERE matricule = '"+etudiant.getMatricule()+"'");

	}


	@Override
	public void deltUser(IUtilisateur usr) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM utilisateur WHERE matricule = '" + usr.getMatricule() + "'");

	}


	@Override
	public void delSalle(ISalle salle) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM salle WHERE codeSalle = '"+salle.getCodeSalle()+"' ");
		
	}


	@Override
	public void delFliere(IFiliere filiere) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM filiere WHERE codeFiliere = '"+filiere.getCodeFil()+"'");
		
	}


	@Override
	public void delGroupe(IGroupe grp) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM groupe WHERE idGrp = '"+grp.getCodeGrp()+"'");
		
	}


	@Override
	public void delNiveau(INiveau nivveau) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM niveau WHERE idNiveau = " + nivveau.getIdNiv());
		
	}


	@Override
	public void delSemestre(ISemestre semestre) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * semestre WHERE idSem = " + semestre.getIdSem());
		
	}


	@Override
	public void delAnnee(IAnnee annee) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM annee WHERE idAnnee = " +annee.getIdAnnee());
		
	}


	@Override
	public void delMatiere(IMatiere matiere) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM matiere WHERE codeMatiere = '"+ matiere.getCodeMat() +"'");
		
	}


	@Override
	public void delDepartement(IDepartement dpt) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM departement WHERE codeDepartement = '" + dpt.getCodeDepart() + "'");
		
	}


	@Override
	public void delAdministrateur(IAdministrateur admin) {

		// TODO Auto-generated method stub
		Requete delRequest = new Requete();
		delRequest.executeUpdate("DELETE * FROM administrateur WHERE matricule = '" + admin.getMatricule() + "'");
		
	}

}

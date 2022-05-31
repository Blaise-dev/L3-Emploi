package BusinessLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.ISelectDAO;
import BusinessLayer.DAOLayer.SelectDAO;
import BusinessLayer.InterfacesBusiness.IAdministrateur;
import BusinessLayer.InterfacesBusiness.IUtilisateur;

public class Administrateur extends Utilisateur implements IAdministrateur {


	/**
	 * @see IAdministrateur#supprimerEtudiant(String)
	 *  
	 */
	public void supprimerEtudiant(String matricule) {

	}


	/**
	 * @see IAdministrateur#modifierEtudiant(String, String, String, String, String, String, String)
	 *  
	 */
	public void modifierEtudiant(String matricule, String nouvMatricule, String nouvMdp, String nouvNom, String nouvPrenom, String nouvEmail, String nouvDateNais) {

	}


	/**
	 * @see IAdministrateur#supprimerEnseignant(String)
	 *  
	 */
	public void supprimerEnseignant(String matricule) {

	}


	/**
	 * @see IAdministrateur#modifierEnseignant(String, String, String, String, String, String, String, String)
	 *  
	 */
	public void modifierEnseignant(String matricule, String nouvMatricule, String nouvMdp, String nouvNom, String nouvPrenom, String nouvEmail, String nouvDateNais, String nouvGradeEns) {

	}


	/**
	 * @see IAdministrateur#supprimerSuivi(String, String, String, String, String)
	 *  
	 */
	public void supprimerSuivi(String matriculeEns, String codeSalle, String codeGrp, String codeMat, String codeSem) {

	}


	/**
	 * @see IAdministrateur#modifierSuivi(String, String, String, String, String, String, String, String, String, String)
	 *  
	 */
	public void modifierSuivi(String matriculeEns, String codeSalle, String codeGrp, String codeMat, String codeSem, String nouvMatriculeEns, String nouvCodeSalle, String nouvCodeGrp, String nouvCodeMat, String nouvCodeSem) {

	}

	/**
	 * @see Etudiant#fillEtd(IUtilisateur)
	 */
	public void fillAdm(IUtilisateur usr) {
                this.setMatricule(usr.getMatricule());
		ISelectDAO select = new SelectDAO();
                select.selAdministrateur(this);
	}
}

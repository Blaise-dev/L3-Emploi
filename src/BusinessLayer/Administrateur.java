package BusinessLayer;

import BusinessLayer.DAOLayer.DeleteDAO;
import BusinessLayer.DAOLayer.SelectDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.ISelectDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.IUpdateDAO;
import BusinessLayer.DAOLayer.UpdateDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.IInsertDAO;
import BusinessLayer.DAOLayer.InsertDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.IDeleteDAO;
import BusinessLayer.InterfacesBusiness.IAdministrateur;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.ISuiviCours;
import BusinessLayer.InterfacesBusiness.IUtilisateur;

public class Administrateur extends Utilisateur implements IAdministrateur {


	/**
	 * @see IAdministrateur#ajouterEtudiant(IEtudiant)
	 *  
	 */


	public void ajouterEtudiant(IEtudiant etudiant) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertEtudiant(etudiant);
	}


	/**
	 * @see IAdministrateur#supprimerEtudiant(String)
	 *  
	 */
	public void supprimerEtudiant(String matricule) {
            IEtudiant etd = new Etudiant();
            etd.setMatricule(matricule);
            IDeleteDAO delete = new DeleteDAO();
            delete.delEtudiant(etd);
	}


	/**
	 * @see IAdministrateur#modifierEtudiant(IEtudiant)
	 *  
	 */
	public void modifierEtudiant(IEtudiant etudiant) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updEtudiant(etudiant);
	}


	/**
	 * @see IAdministrateur#ajouterEnseignant(IEnseignant)
	 *  
	 */
	public void ajouterEnseignant(IEnseignant enseignant) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertEnseignant(enseignant);
	}


	/**
	 * @see IAdministrateur#supprimerEnseignant(String)
	 *  
	 */
	public void supprimerEnseignant(String matricule) {
            IEnseignant ens = new Enseignant();
            ens.setMatricule(matricule);
            IDeleteDAO delete = new DeleteDAO();
            delete.delEnseignant(ens);
	}


	/**
	 * @see IAdministrateur#modifierEnseignant(IEnseignant)
	 *  
	 */
	public void modifierEnseignant(IEnseignant enseignant) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updEnseignant(enseignant);
	}


	/**
	 * @see IAdministrateur#ajouterSuivi(ISuiviCours)
	 *  
	 */
	public void ajouterSuivi(ISuiviCours suivi) {
            IInsertDAO insertion = new InsertDAO();
            insertion.insertSuivi(suivi);
	}


	/**
	 * @see IAdministrateur#supprimerSuivi(ISuiviCours)
	 *  
	 */
	public void supprimerSuivi(ISuiviCours suivi) {
            IDeleteDAO delete = new DeleteDAO();
            delete.delSuivi(suivi);
	}


	/**
	 * @see IAdministrateur#modifierSuivi(ISuiviCours)
	 *  
	 */
	public void modifierSuivi(ISuiviCours suivi) {
            IUpdateDAO upd = new UpdateDAO();
            upd.updSuivi(suivi);
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

package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.*;


public interface IInsertDAO {

	/**
	 *  
	 */
	public abstract void insertLoginPass(String logon, String pass);

	public abstract void insertEtudiant(IEtudiant etudiant);

	public abstract void insertEnseignant(IEnseignant ens);

	public abstract void insertSuivi(ISuiviCours suivi);

}

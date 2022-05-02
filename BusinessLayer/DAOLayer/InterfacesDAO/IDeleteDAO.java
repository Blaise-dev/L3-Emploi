package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.*;


public interface IDeleteDAO {

	public abstract void delSuivi(ISuiviCours suivi);

	public abstract void delEnseignant(IEnseignant ens);

	public abstract void delEtudiant(IEtudiant etudiant);

}

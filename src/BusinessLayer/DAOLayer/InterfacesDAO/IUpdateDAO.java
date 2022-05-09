package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.*;

public interface IUpdateDAO {

	/**
	 *  
	 */
	public abstract void updUser(IUtilisateur usr);

	public abstract void updSalle(ISalle salle);

	/**
	 *  
	 */
	public abstract void updFiliere(IFiliere filiere);

	/**
	 *  
	 */
	public abstract void updGroupe(IGroupe groupe);

	/**
	 *  
	 */
	public abstract void updNiveau(INiveau niveau);

	/**
	 *  
	 */
	public abstract void updSemestre(ISemestre semestre);

	/**
	 *  
	 */
	public abstract void updAnnee(IAnnee annee);

	/**
	 *  
	 */
	public abstract void updMatiere(IMatiere matiere);

	/**
	 *  
	 */
	public abstract void updDepartement(IDepartement dpt);

	/**
	 *  
	 */
	public abstract void updEnseignant(IEnseignant ens);

	/**
	 *  
	 */
	public abstract void updAdministrateur(IAdministrateur admin);

	/**
	 *  
	 */
	public abstract void updEtudiant(IEtudiant etudiant);

	/**
	 *  
	 */
	public abstract void updSuivi(ISuiviCours suivi);

}

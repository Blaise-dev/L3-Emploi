package BusinessLayer.InterfacesBusiness;

public interface IAdministrateur extends IUtilisateur {

	/**
	 *  
	 */
        public abstract void ajouterEtudiant(IEtudiant etudiant);
	/**
	 *  
	 */
	public abstract void supprimerEtudiant(String matricule);

	/**
	 *  
	 */
	public abstract void modifierEtudiant(IEtudiant etudiant);

	/**
	 *  
	 */
        public abstract void ajouterEnseignant(IEnseignant ens);

	/**
	 *  
	 */
	public abstract void supprimerEnseignant(String matricule);

	/**
	 *  
	 */
	public abstract void modifierEnseignant(IEnseignant ens);

	/**
	 *  
	 */
        public abstract void ajouterSuivi(ISuiviCours suivi);

	/**
	 *  
	 */
	public abstract void supprimerSuivi(ISuiviCours suivi);

	/**
	 *  
	 */
	public abstract void modifierSuivi(ISuiviCours suivi);

	/**
	 *  
	 */
        public abstract void fillAdm(IUtilisateur usr);
}

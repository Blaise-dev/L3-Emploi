package BusinessLayer.InterfacesBusiness;

public interface IUtilisateur {

	public abstract void connecter(String login, String pass);

	public abstract void deconnecter(String login, String pass);

	/**
	 *  
	 */
	public abstract String getMatricule();

	/**
	 *  
	 */
	public abstract String getMdp();

	/**
	 *  
	 */
	public abstract String getNom();

	/**
	 *  
	 */
	public abstract String getPrenom();

	/**
	 *  
	 */
	public abstract String getEmail();

	/**
	 *  
	 */
	public abstract String getDateNais();

	/**
	 *  
	 */
	public abstract void setMatricule(String matricule);

	/**
	 *  
	 */
	public abstract void setMdp(String mdp);

	/**
	 *  
	 */
	public abstract void setNom(String nom);

	/**
	 *  
	 */
	public abstract void setPrenom(String prenom);

	/**
	 *  
	 */
	public abstract void setEmail(String email);

	/**
	 *  
	 */
	public abstract void setDateNais(String dateNais);

}

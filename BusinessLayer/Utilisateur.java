package BusinessLayer;

import BusinessLayer.InterfacesBusiness.IUtilisateur;


public class Utilisateur implements IUtilisateur {

	private String matricule;

	private String mdp;

	private String nom;

	private String prenom;

	private String email;

	private String dateNais;


	/**
	 * @see IUtilisateur#connecter(String, String)
	 */
	public void connecter(String login, String pass) {

	}


	/**
	 * @see IUtilisateur#deconnecter(String, String)
	 */
	public void deconnecter(String login, String pass) {

	}


	/**
	 * @see IUtilisateur#getMatricule()
	 *  
	 */
	public String getMatricule() {
		return null;
	}


	/**
	 * @see IUtilisateur#getMdp()
	 *  
	 */
	public String getMdp() {
		return null;
	}


	/**
	 * @see IUtilisateur#getNom()
	 *  
	 */
	public String getNom() {
		return null;
	}


	/**
	 * @see IUtilisateur#getPrenom()
	 *  
	 */
	public String getPrenom() {
		return null;
	}


	/**
	 * @see IUtilisateur#getEmail()
	 *  
	 */
	public String getEmail() {
		return null;
	}


	/**
	 * @see IUtilisateur#getDateNais()
	 *  
	 */
	public String getDateNais() {
		return null;
	}


	/**
	 * @see IUtilisateur#setMatricule(String)
	 *  
	 */
	public void setMatricule(String matricule) {

	}


	/**
	 * @see IUtilisateur#setMdp(String)
	 *  
	 */
	public void setMdp(String mdp) {

	}


	/**
	 * @see IUtilisateur#setNom(String)
	 *  
	 */
	public void setNom(String nom) {

	}


	/**
	 * @see IUtilisateur#setPrenom(String)
	 *  
	 */
	public void setPrenom(String prenom) {

	}


	/**
	 * @see IUtilisateur#setEmail(String)
	 *  
	 */
	public void setEmail(String email) {

	}


	/**
	 * @see IUtilisateur#setDateNais(String)
	 *  
	 */
	public void setDateNais(String dateNais) {

	}

}

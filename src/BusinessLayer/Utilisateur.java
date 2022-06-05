package BusinessLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.ISelectDAO;
import BusinessLayer.DAOLayer.SelectDAO;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IUtilisateur;

public class Utilisateur implements IUtilisateur {

	private String matricule;

	private String mdp;

	private String nom;

	private String prenom;

	private String email;

	private String dateNais;

	private String type;


	/**
	 * @see IUtilisateur#connecter(String, String)
	 */
	public boolean connecter(String login, String pass) {
		ISelectDAO select = new SelectDAO();
                boolean success = false;
                this.setMatricule(login);
		select.selUser(this);
                if(this.getMdp() != null) {
                    if(this.getMdp().equals(pass)) {
                        success = true;
                    }
                }
		return success;
	}


	/**
	 * @see Utilisateur#isStudent()
	 */
	public boolean isStudent() {
            return this.type.equals("etudiant") || this.type.equals("etudiante") || this.type.equals("étudiante") || this.type.equals("étudiant");
	}


	/**
	 * @see Utilisateur#isTeacher()
	 */
	public boolean isTeacher() {
            return this.type.equals("ens");
	}


	/**
	 * @see Utilisateur#isAdmin()
	 */
	public boolean isAdmin() {
            return this.type.equals("admin");
	}


	/**
	 * @see IUtilisateur#deconnecter(String, String)
	 */
	public void deconnecter() {

	}


	/**
	 * @see IUtilisateur#getMatricule()
	 *  
	 */
	public String getMatricule() {
		return matricule;
	}


	/**
	 * @see IUtilisateur#getMdp()
	 *  
	 */
	public String getMdp() {
		return mdp;
	}


	/**
	 * @see IUtilisateur#getNom()
	 *  
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @see IUtilisateur#getPrenom()
	 *  
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @see IUtilisateur#getEmail()
	 *  
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @see IUtilisateur#getDateNais()
	 *  
	 */
	public String getDateNais() {
		return dateNais;
	}


	/**
	 * @see IUtilisateur#getType()
	 *  
	 */
	public String getType() {
		return type;
	}


	/**
	 * @see IUtilisateur#setMatricule(String)
	 *  
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;

	}


	/**
	 * @see IUtilisateur#setMdp(String)
	 *  
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;

	}


	/**
	 * @see IUtilisateur#setNom(String)
	 *  
	 */
	public void setNom(String nom) {
		this.nom = nom;

	}


	/**
	 * @see IUtilisateur#setPrenom(String)
	 *  
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;

	}


	/**
	 * @see IUtilisateur#setEmail(String)
	 *  
	 */
	public void setEmail(String email) {
		this.email = email;

	}


	/**
	 * @see IUtilisateur#setDateNais(String)
	 *  
	 */
	public void setDateNais(String dateNais) {
		this.dateNais = dateNais;

	}


	/**
	 * @see IUtilisateur#setType(String)
	 *  
	 */
	public void setType(String type) {
		this.type = type;

	}

}

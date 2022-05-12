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


	/**
	 * @see IUtilisateur#connecter(String, String)
	 */
	public static IUtilisateur connecter(String login, String pass) {
		IUtilisateur usr = new Utilisateur();
		IEtudiant etd = new Etudiant();
		IEnseignant ens = new Enseignant();
		ISelectDAO select = new SelectDAO();
		etd.setMatricule(login);
		ens.setMatricule(login);
		usr = null;
		etd.setMdp(null);
		ens.setGradeEns(null);
		select.selEtudiant(etd);
		select.selEnseignant(ens);
		if(etd.getMdp() != null) {
                    if(etd.getMdp().equals(pass)) {
			usr = etd;
                    }
                    else
			etd = null;
		}
		if(ens.getMdp() != null) {
                    if(ens.getMdp().equals(pass))
			usr = ens;
                    else
			ens = null;
		}
		return usr;
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

}

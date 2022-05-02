package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IDepartement;

public class Departement implements IDepartement {

	private String codeDepart;

	private String nomDepart;

	private Collection<Enseignant> enseignant;

	private Collection<Matiere> matiere;


	/**
	 * @see IDepartement#getCodeDepart()
	 */
	public String getCodeDepart() {
		return null;
	}


	/**
	 * @see IDepartement#getNomDepart()
	 *  
	 */
	public String getNomDepart() {
		return null;
	}


	/**
	 * @see IDepartement#setCodeDepart(String)
	 */
	public void setCodeDepart(String codeDepart) {

	}


	/**
	 * @see IDepartement#setNomDepart(String)
	 *  
	 */
	public void setNomDepart(String nomDepart) {

	}

}

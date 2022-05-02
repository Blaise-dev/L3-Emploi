package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.INiveau;

public class Niveau implements INiveau {

	private String codeNiv;

	private String nomNiv;

	private Collection<Semestre> semestre;

	private Groupe groupe;

	private Filiere filiere;


	/**
	 * @see INiveau#getCodeNiv()
	 *  
	 */
	public String getCodeNiv() {
		return null;
	}


	/**
	 * @see INiveau#getNomNiv()
	 *  
	 */
	public String getNomNiv() {
		return null;
	}


	/**
	 * @see INiveau#setCodeNiv(String)
	 *  
	 */
	public void setCodeNiv(String codeNiv) {

	}


	/**
	 * @see INiveau#setNomNiv(String)
	 *  
	 */
	public void setNomNiv(String nomNiv) {

	}

}

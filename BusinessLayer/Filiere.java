package BusinessLayer;

import BusinessLayer.InterfacesBusiness.IFiliere;

public class Filiere implements IFiliere {

	private String codeFil;

	private String nomFil;


	/**
	 * @see IFiliere#getLibelleFil()
	 *  
	 */
	public String getCodeFil() {
		return codeFil;
	}


	/**
	 * @see IFiliere#getNomFil()
	 *  
	 */
	public String getNomFil() {
		return nomFil;
	}


	/**
	 * @see IFiliere#setLibelleFil(String)
	 *  
	 */
	public void setCodeFil(String codeFil) {
		this.codeFil = codeFil;

	}


	/**
	 * @see IFiliere#setNomFil(String)
	 *  
	 */
	public void setNomFil(String nomFil) {
		this.nomFil = nomFil;

	}

}

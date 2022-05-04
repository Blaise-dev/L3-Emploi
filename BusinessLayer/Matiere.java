package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IMatiere;

public class Matiere implements IMatiere {

	private String codeMat;

	private String intituleMat;

	private Collection<SuiviCours> suiviCours;

	private Departement departement;


	/**
	 * @see IMatiere#getCodeMat()
	 *  
	 */
	public String getCodeMat() {
		return codeMat;
	}


	/**
	 * @see IMatiere#getIntituleMat()
	 *  
	 */
	public String getIntituleMat() {
		return intituleMat;
	}


	/**
	 * @see IMatiere#setCodeMat(String)
	 *  
	 */
	public void setCodeMat(String codeMat) {
		this.codeMat = codeMat;

	}


	/**
	 * @see IMatiere#setIntituleMat(String)
	 *  
	 */
	public void setIntituleMat(String intituleMat) {
		this.intituleMat = intituleMat;

	}

}

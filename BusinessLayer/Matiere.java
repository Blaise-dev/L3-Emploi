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
		return null;
	}


	/**
	 * @see IMatiere#getIntituleMat()
	 *  
	 */
	public String getIntituleMat() {
		return null;
	}


	/**
	 * @see IMatiere#setCodeMat(String)
	 *  
	 */
	public void setCodeMat(String codeMat) {

	}


	/**
	 * @see IMatiere#setIntituleMat(String)
	 *  
	 */
	public void setIntituleMat(String intituleMat) {

	}

}

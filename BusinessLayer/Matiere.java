package BusinessLayer;

import BusinessLayer.InterfacesBusiness.IDepartement;
import BusinessLayer.InterfacesBusiness.IMatiere;

public class Matiere implements IMatiere {

	private String codeMat;

	private String intituleMat;

	private String codeDepartement;

	private IDepartement departement;


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


	@Override
	public IDepartement getDepartement() {
		// TODO Auto-generated method stub
		return departement;
	}


	@Override
	public void setDepartement(IDepartement dpt) {
		this.departement = dpt;
	}


	@Override
	public String getCodeDepartement() {
		// TODO Auto-generated method stub
		return codeDepartement;
	}


	@Override
	public void setCodeDepartement(String codeDepartement) {
		// TODO Auto-generated method stub
		this.codeDepartement = codeDepartement;
	}

}

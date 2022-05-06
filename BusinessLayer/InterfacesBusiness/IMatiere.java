package BusinessLayer.InterfacesBusiness;

public interface IMatiere {

	/**
	 *  
	 */
	public abstract String getCodeMat();

	/**
	 *  
	 */
	public abstract String getIntituleMat();

	/**
	 *  
	 */
	public abstract IDepartement getDepartement();

	/**
	 *  
	 */
	public abstract String getCodeDepartement();

	/**
	 *  
	 */
	public abstract void setCodeMat(String codeMat);

	/**
	 *  
	 */
	public abstract void setIntituleMat(String intituleMat);

	/**
	 *  
	 */
	public abstract void setDepartement(IDepartement dpt);

	/**
	 *  
	 */
	public abstract void setCodeDepartement(String codeDepartement);

}

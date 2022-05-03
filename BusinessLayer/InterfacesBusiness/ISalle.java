package BusinessLayer.InterfacesBusiness;

public interface ISalle {

	/**
	 *  
	 */
	public abstract String getCodeSalle();

	/**
	 *  
	 */
	public abstract String getNomSalle();

	/**
	 *  
	 */
	public abstract String getType();

	/**
	 *  
	 */
	public abstract String getCapacite();

	/**
	 *  
	 */
	public abstract void setCodeSalle(String codeSalle);

	/**
	 *  
	 */
	public abstract void setNomSalle(String nomSalle);

	/**
	 *  
	 */
	public abstract void setType(String type);

	/**
	 *  
	 */
	public abstract void setCapacite(String capacite);

}

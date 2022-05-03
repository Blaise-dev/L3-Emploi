package BusinessLayer.InterfacesBusiness;

public interface INiveau {

	/**
	 *  
	 */
	public abstract int getIdNiv();

	/**
	 *  
	 */
	public abstract String getCodeNiv();

	/**
	 *  
	 */
	public abstract String getNomNiv();

	/**
	 *  
	 */
	public abstract IFiliere getFiliere();

	/**
	 *  
	 */
	public abstract void setIdNiv(int idNiv);

	/**
	 *  
	 */
	public abstract void setCodeNiv(String codeNiv);

	/**
	 *  
	 */
	public abstract void setNomNiv(String nomNiv);

	/**
	 *  
	 */
	public abstract void setFiliere(IFiliere filiere);

}

package BusinessLayer.InterfacesBusiness;

public interface IGroupe {

	/**
	 *  
	 */
	public abstract String getIdGrp();

	/**
	 *  
	 */
	public abstract String getCodeGrp();

	/**
	 *  
	 */
	public abstract String getNomGrp();

	/**
	 *  
	 */
	public abstract int getEffectifGrp();

	/**
	 *  
	 */
	public abstract INiveau getNiveau();

	/**
	 *  
	 */
	public abstract void setIdGrp(String idGrp);

	/**
	 *  
	 */
	public abstract void setCodeGrp(String codeGrp);

	/**
	 *  
	 */
	public abstract void setNomGrp(String nomGrp);

	/**
	 *  
	 */
	public abstract void setEffectifGrp(int effectifGrp);

	/**
	 *  
	 */
	public abstract void setNiveau(INiveau niveau);

}

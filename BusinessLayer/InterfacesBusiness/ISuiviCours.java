package BusinessLayer.InterfacesBusiness;

public interface ISuiviCours {

	/**
	 *  
	 */
	public abstract String getHeureDebut();

	/**
	 *  
	 */
	public abstract String getHeureFin();

	/**
	 *  
	 */
	public abstract String getJour();

	/**
	 *  
	 */
	public abstract String getCodeMat();

	public abstract String getCodeSalle();

	/**
	 *  
	 */
	public abstract String getCodeSem();

	/**
	 *  
	 */
	public abstract String getCodeGrp();

	/**
	 *  
	 */
	public abstract String getMatriculeEns();

	/**
	 *  
	 */
	public abstract void setJour(String jour);

	/**
	 *  
	 */
	public abstract void setCodeMat(String codeMat);

	public abstract void setCodeSalle(String libelleSalle);

	/**
	 *  
	 */
	public abstract void setCodeSem(String codeSem);

	/**
	 *  
	 */
	public abstract void setCodeGrp(String libelleGrp);

	/**
	 *  
	 */
	public abstract void setMatriculeEns(String matriculeEns);

	/**
	 *  
	 */
	public abstract void setHeureDebut(String heure);

	/**
	 *  
	 */
	public abstract void setHeureFin(String heure);

}

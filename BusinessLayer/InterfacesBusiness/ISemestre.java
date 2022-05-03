package BusinessLayer.InterfacesBusiness;

public interface ISemestre {

	public abstract int getIdSem();

	public abstract String getCodeSem();

	/**
	 *  
	 */
	public abstract String getNomSem();

	public abstract int getIdAnnee();

	/**
	 *  
	 */
	public abstract IAnnee getAnnee();

	public abstract void setIdSem(int idSem);

	public abstract void setCodeSem(String codeSem);

	/**
	 *  
	 */
	public abstract void setNomSem(String nomSem);

	public abstract void setIdAnnee(int idAnnee);

	/**
	 *  
	 */
	public abstract void setAnnee(IAnnee annee);

}

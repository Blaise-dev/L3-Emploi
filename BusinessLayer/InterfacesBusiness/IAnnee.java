package BusinessLayer.InterfacesBusiness;

import BusinessLayer.Semestre;

public interface IAnnee {

	/**
	 *  
	 */
	public abstract int getIdAnnee();

	/**
	 *  
	 */
	public abstract String getAnneeDebut();

	/**
	 *  
	 */
	public abstract String getAnneeFin();

	/**
	 *  
	 */
	public abstract void setIdAnnee(int idAnnee);

	/**
	 *  
	 */
	public abstract void setAnneeDebut(String annee);

	/**
	 *  
	 */
	public abstract void setAnneeFin(String annee);

	public Semestre getSemestre();

	public void setSemestre(Semestre semestre);

}

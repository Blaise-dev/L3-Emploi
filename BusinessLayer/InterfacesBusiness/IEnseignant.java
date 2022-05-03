package BusinessLayer.InterfacesBusiness;

import java.util.List;

public interface IEnseignant extends IUtilisateur {

	/**
	 *  
	 */
	public abstract String getGradeEns();

	/**
	 *  
	 */
	public abstract String getCodeDepartement();

	/**
	 *  
	 */
	public IDepartement getDepartement();

	/**
	 *  
	 */
	public List<ISuiviCours> getSuiviCours();

	/**
	 *  
	 */
	public abstract void setGradeEns(String gradeEns);

	/**
	 *  
	 */
	public abstract void setCodeDepartement(String codeDepartement);

	/**
	 *  
	 */
	public void setDepartement(IDepartement dpt);

	/**
	 *  
	 */
	public void setSuiviCours(List<ISuiviCours> suiviCours);

}

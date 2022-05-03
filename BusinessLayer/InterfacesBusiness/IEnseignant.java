package BusinessLayer.InterfacesBusiness;

import java.util.Collection;

import BusinessLayer.SuiviCours;

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
	public Collection<ISuiviCours> getSuiviCours();

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
	public void setSuiviCours(Collection<ISuiviCours> suiviCours);

}

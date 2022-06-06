package BusinessLayer.InterfacesBusiness;

import java.util.ArrayList;
import java.util.HashMap;
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
	public abstract IDepartement getDepartement();

	/**
	 *  
	 */
	public abstract List<ISuiviCours> getSuiviCours();

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
	public abstract void setDepartement(IDepartement dpt);

	/**
	 *  
	 */
	public abstract void setSuiviCours();

	/**
	 *
	 */
	public abstract void fillEns(IUtilisateur usr);

	/**
	 *
	 */
        public abstract ArrayList<IEnseignant> getColleagues();

        /**
	 *
	 */
        public HashMap<String, List<ISuiviCours>> getTimeTable();
}

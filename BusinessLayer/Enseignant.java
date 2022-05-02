package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IEnseignant;

public class Enseignant extends Utilisateur implements IEnseignant {

	private String gradeEns;

	private Departement departement;

	private Collection<SuiviCours> suiviCours;


	/**
	 * @see BusinessLayer.IEnseignant#getGradeEns()
	 *  
	 */
	public String getGradeEns() {
		return null;
	}


	/**
	 * @see BusinessLayer.IEnseignant#setGradeEns(String)
	 *  
	 */
	public void setGradeEns(String gradeEns) {

	}

}

package BusinessLayer;

import java.util.List;

import BusinessLayer.InterfacesBusiness.IDepartement;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.ISuiviCours;

public class Enseignant extends Utilisateur implements IEnseignant {

	private String gradeEns;

	private String codeDepartement;

	private IDepartement departement;

	private List<ISuiviCours> suiviCours;


	/**
	 * @see BusinessLayer.IEnseignant#getGradeEns()
	 *  
	 */
	public String getGradeEns() {
		return gradeEns;
	}


	/**
	 * @see BusinessLayer.IEnseignant#setGradeEns(String)
	 *  
	 */
	public void setGradeEns(String gradeEns) {
		this.gradeEns = gradeEns;

	}


	@Override
	public IDepartement getDepartement() {
		return departement;
	}


	@Override
	public void setDepartement(IDepartement dpt) {
		this.departement = dpt;
		
	}


	@Override
	public List<ISuiviCours> getSuiviCours() {
		return suiviCours;
	}


	@Override
	public void setSuiviCours() {
		
		
	}


	@Override
	public String getCodeDepartement() {
		// TODO Auto-generated method stub
		return codeDepartement;
	}


	@Override
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
		
	}

}

package BusinessLayer;

import java.util.List;

import BusinessLayer.InterfacesBusiness.IDepartement;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.ISuiviCours;

public class Enseignant extends Utilisateur implements IEnseignant {

	private String gradeEns;

	private Departement departement;

	private List<SuiviCours> suiviCours;


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


	@Override
	public IDepartement getDepartement() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setDepartement(IDepartement dpt) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<ISuiviCours> getSuiviCours() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setSuiviCours(List<ISuiviCours> suiviCours) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getCodeDepartement() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setCodeDepartement(String codeDepartement) {
		// TODO Auto-generated method stub
		
	}

}

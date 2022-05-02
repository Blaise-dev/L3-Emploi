package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.ISuiviCours;


public class SuiviCours implements ISuiviCours {

	private String heureDebut;

	private String heureFin;

	private String Jour;

	private String codeMat;

	private String codeSalle;

	private String codeSem;

	private String codeGrp;

	private String matriculeEns;

	private Collection<Matiere> matiere;

	private Enseignant enseignant;

	private Salle salle;

	private Groupe groupe;

	private Semestre semestre;


	/**
	 * @see ISuiviCours#getHeureDebut()
	 *  
	 */
	public String getHeureDebut() {
		return null;
	}


	/**
	 * @see ISuiviCours#getHeureFin()
	 *  
	 */
	public String getHeureFin() {
		return null;
	}


	/**
	 * @see ISuiviCours#getJour()
	 *  
	 */
	public String getJour() {
		return null;
	}


	/**
	 * @see ISuiviCours#getCodeMat()
	 *  
	 */
	public String getCodeMat() {
		return null;
	}


	/**
	 * @see ISuiviCours#getCodeSalle()
	 */
	public String getCodeSalle() {
		return null;
	}


	/**
	 * @see ISuiviCours#getCodeSem()
	 *  
	 */
	public String getCodeSem() {
		return null;
	}


	/**
	 * @see ISuiviCours#getCodeGrp()
	 *  
	 */
	public String getCodeGrp() {
		return null;
	}


	/**
	 * @see ISuiviCours#getMatriculeEns()
	 *  
	 */
	public String getMatriculeEns() {
		return null;
	}


	/**
	 * @see ISuiviCours#setJour(String)
	 *  
	 */
	public void setJour(String jour) {

	}


	/**
	 * @see ISuiviCours#setCodeMat(String)
	 *  
	 */
	public void setCodeMat(String codeMat) {

	}


	/**
	 * @see ISuiviCours#setCodeSalle(String)
	 */
	public void setCodeSalle(String libelleSalle) {

	}


	/**
	 * @see ISuiviCours#setCodeSem(String)
	 *  
	 */
	public void setCodeSem(String codeSem) {

	}


	/**
	 * @see ISuiviCours#setCodeGrp(String)
	 *  
	 */
	public void setCodeGrp(String libelleGrp) {

	}


	/**
	 * @see ISuiviCours#setMatriculeEns(String)
	 *  
	 */
	public void setMatriculeEns(String matriculeEns) {

	}


	/**
	 * @see ISuiviCours#setHeureDebut(String)
	 *  
	 */
	public void setHeureDebut(String heure) {

	}


	/**
	 * @see ISuiviCours#setHeureFin(String)
	 *  
	 */
	public void setHeureFin(String heure) {

	}

}

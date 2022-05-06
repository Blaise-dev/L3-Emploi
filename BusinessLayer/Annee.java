package BusinessLayer;

import BusinessLayer.InterfacesBusiness.IAnnee;

public class Annee implements IAnnee {

	private int idAnnee;

	private String anneeDebut;

	private String anneeFin;

	private Semestre semestre;


	/**
	 * @see IAnnee#getAnneeDebut()
	 *  
	 */
	public String getAnneeDebut() {
		return anneeDebut;
	}


	/**
	 * @see IAnnee#getAnneeFin()
	 *  
	 */
	public String getAnneeFin() {
		return anneeFin;
	}


	/**
	 * @see IAnnee#setAnneeDebut(String)
	 *  
	 */
	public void setAnneeDebut(String annee) {
		this.anneeDebut = annee;

	}


	/**
	 * @see IAnnee#setAnneeFin(String)
	 *  
	 */
	public void setAnneeFin(String annee) {
		this.anneeFin = annee;

	}


	@Override
	public int getIdAnnee() {
		return idAnnee;
	}


	@Override
	public void setIdAnnee(int idAnnee) {
		this.idAnnee = idAnnee;
		
	}


	public Semestre getSemestre() {
		return semestre;
	}


	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}

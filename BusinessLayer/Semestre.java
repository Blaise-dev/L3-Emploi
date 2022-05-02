package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.ISemestre;

public class Semestre implements ISemestre {

	private String codeSem;

	private String nomSem;

	private Collection<SuiviCours> suiviCours;

	private Annee annee;

	private Collection<Niveau> niveau;


	/**
	 * @see ISemestre#getCodeSem()
	 */
	public String getCodeSem() {
		return null;
	}


	/**
	 * @see ISemestre#getNomSem()
	 *  
	 */
	public String getNomSem() {
		return null;
	}


	/**
	 * @see ISemestre#setCodeSem(String)
	 */
	public void setCodeSem(String codeSem) {

	}


	/**
	 * @see ISemestre#setNomSem(String)
	 *  
	 */
	public void setNomSem(String nomSem) {

	}

}

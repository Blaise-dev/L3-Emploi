package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IAnnee;
import BusinessLayer.InterfacesBusiness.ISemestre;

public class Semestre implements ISemestre {

	private int idSem;

	private String codeSem;

	private String nomSem;

	private int idAnnee;

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


	@Override
	public int getIdSem() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public IAnnee getAnnee() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setIdSem(int idSem) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setAnnee(IAnnee annee) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int getIdAnnee() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setIdAnnee(int idAnnee) {
		// TODO Auto-generated method stub
		
	}

}

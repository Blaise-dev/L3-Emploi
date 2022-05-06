package BusinessLayer;

import BusinessLayer.InterfacesBusiness.IAnnee;
import BusinessLayer.InterfacesBusiness.ISemestre;

public class Semestre implements ISemestre {

	private int idSem;

	private String codeSem;

	private String nomSem;

	private int idAnnee;

	private IAnnee annee;


	/**
	 * @see ISemestre#getCodeSem()
	 */
	public String getCodeSem() {
		return codeSem;
	}


	/**
	 * @see ISemestre#getNomSem()
	 *  
	 */
	public String getNomSem() {
		return nomSem;
	}


	/**
	 * @see ISemestre#setCodeSem(String)
	 */
	public void setCodeSem(String codeSem) {
		this.codeSem = codeSem;

	}


	/**
	 * @see ISemestre#setNomSem(String)
	 *  
	 */
	public void setNomSem(String nomSem) {
		this.nomSem = nomSem;

	}


	@Override
	public int getIdSem() {
		// TODO Auto-generated method stub
		return idSem;
	}


	@Override
	public IAnnee getAnnee() {
		// TODO Auto-generated method stub
		return annee;
	}


	@Override
	public void setIdSem(int idSem) {
		this.idSem = idSem;
		
	}


	@Override
	public void setAnnee(IAnnee annee) {
		this.annee = annee;
		
	}


	@Override
	public int getIdAnnee() {
		return idAnnee;
	}


	@Override
	public void setIdAnnee(int idAnnee) {
		this.idAnnee = idAnnee;
		
	}

}

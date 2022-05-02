package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IGroupe;

public class Groupe implements IGroupe {

	private String codeGrp;

	private String libelleGrp;

	private int effectifGrp;

	private Collection<SuiviCours> suiviCours;

	private Niveau niveau;


	/**
	 * @see IGroupe#getCodeGrp()
	 *  
	 */
	public String getCodeGrp() {
		return null;
	}


	/**
	 * @see IGroupe#getLibelleGrp()
	 *  
	 */
	public String getLibelleGrp() {
		return null;
	}


	/**
	 * @see IGroupe#getEffectifGrp()
	 *  
	 */
	public int getEffectifGrp() {
		return 0;
	}


	/**
	 * @see IGroupe#getCodeGrp()
	 *  
	 */
	public void setCodeGrp(String codeGrp) {

	}


	/**
	 * @see IGroupe#setLibelleGrp(String)
	 *  
	 */
	public void setLibelleGrp(String libelleGrp) {

	}


	/**
	 * @see IGroupe#setEffectifGrp(int)
	 *  
	 */
	public void setEffectifGrp(int effectifGrp) {

	}

}

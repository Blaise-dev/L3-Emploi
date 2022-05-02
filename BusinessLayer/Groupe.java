package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IGroupe;


public class Groupe implements IGroupe {

	private String libelleGrp;

	private int effectifGrp;

	private Collection<SuiviCours> suiviCours;

	private Niveau niveau;


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

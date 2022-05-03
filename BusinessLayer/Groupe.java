package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.INiveau;

public class Groupe implements IGroupe {

	private int idGrp;

	private String codeGrp;

	private String nomGrp;

	private int effectifGrp;

	private Collection<SuiviCours> suiviCours;

	private Niveau niveau;


	/**
	 * @see BusinessLayer.IGroupe#getIdGrp()
	 *  
	 */
	public String getIdGrp() {
		return null;
	}


	/**
	 * @see BusinessLayer.IGroupe#getCodeGrp()
	 *  
	 */
	public String getCodeGrp() {
		return null;
	}


	/**
	 * @see BusinessLayer.IGroupe#getNomGrp()
	 *  
	 */
	public String getNomGrp() {
		return null;
	}


	/**
	 * @see BusinessLayer.IGroupe#getEffectifGrp()
	 *  
	 */
	public int getEffectifGrp() {
		return 0;
	}


	/**
	 * @see BusinessLayer.IGroupe#setIdGrp(String)
	 *  
	 */
	public void setIdGrp(String idGrp) {

	}


	/**
	 * @see BusinessLayer.IGroupe#setCodeGrp(String)
	 *  
	 */
	public void setCodeGrp(String codeGrp) {

	}


	/**
	 * @see BusinessLayer.IGroupe#setNomGrp(String)
	 *  
	 */
	public void setNomGrp(String nomGrp) {

	}


	/**
	 * @see BusinessLayer.IGroupe#setEffectifGrp(int)
	 *  
	 */
	public void setEffectifGrp(int effectifGrp) {

	}


	@Override
	public INiveau getNiveau() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setNiveau(INiveau niveau) {
		// TODO Auto-generated method stub
		
	}

}

package BusinessLayer;

import java.util.ArrayList;

import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.INiveau;
import BusinessLayer.InterfacesBusiness.ISuiviCours;

public class Groupe implements IGroupe {

	private int idGrp;

	private String codeGrp;

	private String nomGrp;

	private int effectifGrp;

	private int idNiveau;

	private ArrayList<ISuiviCours> suiviCours;

	private ArrayList<IEtudiant> etudiant;

	private INiveau niveau;


	/**
	 * @see BusinessLayer.IGroupe#getIdGrp()
	 *  
	 */
	public int getIdGrp() {
		return idGrp;
	}


	/**
	 * @see BusinessLayer.IGroupe#getCodeGrp()
	 *  
	 */
	public String getCodeGrp() {
		return codeGrp;
	}


	/**
	 * @see BusinessLayer.IGroupe#getNomGrp()
	 *  
	 */
	public String getNomGrp() {
		return nomGrp;
	}


	/**
	 * @see BusinessLayer.IGroupe#getEffectifGrp()
	 *  
	 */
	public int getEffectifGrp() {
		return effectifGrp;
	}


	/**
	 * @see BusinessLayer.IGroupe#setIdGrp(String)
	 *  
	 */
	public void setIdGrp(int idGrp) {
		this.idGrp = idGrp;

	}


	/**
	 * @see BusinessLayer.IGroupe#setCodeGrp(String)
	 *  
	 */
	public void setCodeGrp(String codeGrp) {
		this.codeGrp = codeGrp;
	}


	/**
	 * @see BusinessLayer.IGroupe#setNomGrp(String)
	 *  
	 */
	public void setNomGrp(String nomGrp) {
		this.nomGrp = nomGrp;

	}


	/**
	 * @see BusinessLayer.IGroupe#setEffectifGrp(int)
	 *  
	 */
	public void setEffectifGrp(int effectifGrp) {
		this.effectifGrp = effectifGrp;
	}


	@Override
	public INiveau getNiveau() {
		// TODO Auto-generated method stub
		return niveau;
	}


	@Override
	public void setNiveau(INiveau niveau) {
		this.niveau = niveau;
		
	}


	@Override
	public ArrayList<IEtudiant> getEtudiant() {
		return etudiant;
	}


	@Override
	public void setEtudiant(ArrayList<IEtudiant> etudiant) {
		 this.etudiant = etudiant;
		
	}


	@Override
	public int getIdNiveau() {
		// TODO Auto-generated method stub
		return idNiveau;
	}


	@Override
	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
		
	}


	public ArrayList<ISuiviCours> getSuiviCours() {
		return suiviCours;
	}


	public void setSuiviCours(ArrayList<ISuiviCours> suiviCours) {
		this.suiviCours = suiviCours;
	}

}

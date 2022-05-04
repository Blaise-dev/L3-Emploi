package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.INiveau;

public class Groupe implements IGroupe {

	private int idGrp;

	private String codeGrp;

	private String nomGrp;

	private int effectifGrp;

	private int idNiveau;

	private Collection<SuiviCours> suiviCours;

	private Collection<Etudiant> etudiant;

	private Niveau niveau;


	/**
	 * @see BusinessLayer.IGroupe#getIdGrp()
	 *  
	 */
	public String getIdGrp() {
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
	public void setIdGrp(String idGrp) {
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
		this.niveau =niveau;
		
	}


	@Override
	public Collection<IEtudiant> getEtudiant() {
		return etudiant;
	}


	@Override
	public void setEtudiant(Collection<IEtudiant> etudiant) {
		 this.etudiant = etudiant;
		
	}


	@Override
	public int getIdNiveau() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
		
	}

}

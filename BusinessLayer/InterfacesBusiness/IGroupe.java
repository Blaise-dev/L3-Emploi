package BusinessLayer.InterfacesBusiness;

import java.util.ArrayList;

public interface IGroupe {

	/**
	 *  
	 */
	public abstract int getIdGrp();

	/**
	 *  
	 */
	public abstract String getCodeGrp();

	/**
	 *  
	 */
	public abstract String getNomGrp();

	/**
	 *  
	 */
	public abstract int getEffectifGrp();

	/**
	 *  
	 */
	public abstract int getIdNiveau();

	/**
	 *  
	 */
	public abstract INiveau getNiveau();

	/**
	 *  
	 */
	public abstract ArrayList<IEtudiant> getEtudiant();

	/**
	 *  
	 */
	public abstract void setIdGrp(int idGrp);

	/**
	 *  
	 */
	public abstract void setCodeGrp(String codeGrp);

	/**
	 *  
	 */
	public abstract void setNomGrp(String nomGrp);

	/**
	 *  
	 */
	public abstract void setEffectifGrp(int effectifGrp);

	/**
	 *  
	 */
	public abstract void setIdNiveau(int idNiveau);

	/**
	 *  
	 */
	public abstract void setNiveau(INiveau niveau);

	/**
	 *  
	 */
	public abstract void setEtudiant(ArrayList<IEtudiant> etudiant);

}

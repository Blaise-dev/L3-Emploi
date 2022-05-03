package BusinessLayer.InterfacesBusiness;

import java.util.Collection;

public interface INiveau {

	/**
	 *  
	 */
	public abstract int getIdNiv();

	/**
	 *  
	 */
	public abstract String getCodeNiv();

	/**
	 *  
	 */
	public abstract String getNomNiv();

	/**
	 *  
	 */
	public abstract String getCodeFiliere();


	/**
	 *  
	 */
	public abstract Collection<IGroupe> getGroupe();

	/**
	 *  
	 */
	public abstract IFiliere getFiliere();

	/**
	 *  
	 */
	public abstract void setIdNiv(int idNiv);

	/**
	 *  
	 */
	public abstract void setCodeNiv(String codeNiv);

	/**
	 *  
	 */
	public abstract void setNomNiv(String nomNiv);

	/**
	 *  
	 */
	public abstract void setCodeFiliere(String codeFiliere);

	/**
	 *  
	 */
	public abstract void setFiliere(IFiliere filiere);

	/**
	 *  
	 */
	public abstract void setGroupe(Collection<IGroupe> groupe);

}

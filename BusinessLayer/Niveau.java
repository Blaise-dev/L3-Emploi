package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IFiliere;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.INiveau;

public class Niveau implements INiveau {

	private int idNiv;

	private String codeNiv;

	private String nomNiv;

	private String codeFiliere;

	private Collection<Groupe> groupe;

	private Filiere filiere;


	/**
	 * @see BusinessLayer.INiveau#getIdNiv()
	 *  
	 */
	public int getIdNiv() {
		return 0;
	}


	/**
	 * @see BusinessLayer.INiveau#getCodeNiv()
	 *  
	 */
	public String getCodeNiv() {
		return null;
	}


	/**
	 * @see BusinessLayer.INiveau#getNomNiv()
	 *  
	 */
	public String getNomNiv() {
		return null;
	}


	/**
	 * @see BusinessLayer.INiveau#setIdNiv(String)
	 *  
	 */
	public void setIdNiv(int idNiv) {

	}


	/**
	 * @see BusinessLayer.INiveau#setCodeNiv(String)
	 *  
	 */
	public void setCodeNiv(String codeNiv) {

	}


	/**
	 * @see BusinessLayer.INiveau#setNomNiv(String)
	 *  
	 */
	public void setNomNiv(String nomNiv) {

	}


	@Override
	public IFiliere getFiliere() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setFiliere(IFiliere filiere) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Collection<IGroupe> getGroupe() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setGroupe(Collection<IGroupe> groupe) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getCodeFiliere() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setCodeFiliere(String codeFiliere) {
		// TODO Auto-generated method stub
		
	}

}

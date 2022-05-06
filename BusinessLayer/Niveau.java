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

	private Collection<IGroupe> groupe;

	private IFiliere filiere;


	/**
	 * @see BusinessLayer.INiveau#getIdNiv()
	 *  
	 */
	public int getIdNiv() {
		return idNiv;
	}


	/**
	 * @see BusinessLayer.INiveau#getCodeNiv()
	 *  
	 */
	public String getCodeNiv() {
		return codeNiv;
	}


	/**
	 * @see BusinessLayer.INiveau#getNomNiv()
	 *  
	 */
	public String getNomNiv() {
		return nomNiv;
	}


	/**
	 * @see BusinessLayer.INiveau#setIdNiv(String)
	 *  
	 */
	public void setIdNiv(int idNiv) {
		this.idNiv = idNiv;

	}


	/**
	 * @see BusinessLayer.INiveau#setCodeNiv(String)
	 *  
	 */
	public void setCodeNiv(String codeNiv) {
		this.codeNiv = codeNiv;
	}


	/**
	 * @see BusinessLayer.INiveau#setNomNiv(String)
	 *  
	 */
	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;

	}


	@Override
	public IFiliere getFiliere() {
		// TODO Auto-generated method stub
		return filiere;
	}


	@Override
	public void setFiliere(IFiliere filiere) {
		this.filiere = filiere;
		
	}


	@Override
	public Collection<IGroupe> getGroupe() {
		return groupe;
	}


	@Override
	public void setGroupe(Collection<IGroupe> groupe) {
		this.groupe = groupe;
		
	}


	@Override
	public String getCodeFiliere() {
		return codeFiliere;
	}


	@Override
	public void setCodeFiliere(String codeFiliere) {
		this.codeFiliere = codeFiliere;
		
	}

}

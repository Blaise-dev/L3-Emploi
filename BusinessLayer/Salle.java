package BusinessLayer;

import BusinessLayer.InterfacesBusiness.ISalle;

public class Salle implements ISalle {

	private String codeSalle;

	private String nomSalle;

	private String type;

	private int capacite;


	/**
	 * @see BusinessLayer.Salle#setLibelleSalle(String)
	 *  
	 */
	public String getCodeSalle() {
		return codeSalle;
	}

	/**
	 * @see BusinessLayer.Salle#getNomSalle()
	 *  
	 */
	public String getNomSalle() {
		return nomSalle;
	}


	/**
	 * @see BusinessLayer.Salle#getType()
	 *  
	 */
	public String getType() {
		return type;
	}


	/**
	 * @see BusinessLayer.Salle#getCapacite()
	 *  
	 */
	public int getCapacite() {
		return capacite;
	}


	/**
	 * @see BusinessLayer.Salle#setCodeSalle(String)
	 *  
	 */
	public void setCodeSalle(String codeSalle) {
		this.codeSalle = codeSalle;

	}


	/**
	 * @see BusinessLayer.Salle#setNomSalle(String)
	 *  
	 */
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;

	}

	/**
	 * @see BusinessLayer.Salle#setType(String)
	 *  
	 */
	public void setType(String type) {
		this.type = type;

	}


	/**
	 * @see BusinessLayer.Salle#setCapacite(String)
	 *  
	 */
	public void setCapacite(int capacite) {
		this.capacite = capacite;

	}

}

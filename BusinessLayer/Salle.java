package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.ISalle;

public class Salle implements ISalle {

	private String libelleSalle;

	private String type;

	private int capacite;

	private Collection<SuiviCours> suiviCours;


	/**
	 * @see ISalle#getLibelleSalle()
	 *  
	 */
	public String getLibelleSalle() {
		return null;
	}


	/**
	 * @see ISalle#getType()
	 *  
	 */
	public String getType() {
		return null;
	}


	/**
	 * @see ISalle#getCapacite()
	 *  
	 */
	public String getCapacite() {
		return null;
	}


	/**
	 * @see ISalle#setLibelleSalle(String)
	 *  
	 */
	public void setLibelleSalle(String libelleSalle) {

	}


	/**
	 * @see ISalle#setType(String)
	 *  
	 */
	public void setType(String type) {

	}


	/**
	 * @see ISalle#setCapacite(String)
	 *  
	 */
	public void setCapacite(String capacite) {

	}

}

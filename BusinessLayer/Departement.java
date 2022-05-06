package BusinessLayer;

import java.util.ArrayList;

import BusinessLayer.InterfacesBusiness.IDepartement;

public class Departement implements IDepartement {

	private String codeDepart;

	private String nomDepart;

	private ArrayList<Enseignant> enseignant;

	private ArrayList<Matiere> matiere;


	/**
	 * @see IDepartement#getCodeDepart()
	 */
	public String getCodeDepart() {
		return codeDepart;
	}


	/**
	 * @see IDepartement#getNomDepart()
	 *  
	 */
	public String getNomDepart() {
		return nomDepart;
	}


	/**
	 * @see IDepartement#setCodeDepart(String)
	 */
	public void setCodeDepart(String codeDepart) {
		this.codeDepart = codeDepart;

	}


	/**
	 * @see IDepartement#setNomDepart(String)
	 *  
	 */
	public void setNomDepart(String nomDepart) {
		this.nomDepart = nomDepart;

	}


	public ArrayList<Enseignant> getEnseignant() {
		return enseignant;
	}


	public void setEnseignant(ArrayList<Enseignant> enseignant) {
		this.enseignant = enseignant;
	}


	public ArrayList<Matiere> getMatiere() {
		return matiere;
	}


	public void setMatiere(ArrayList<Matiere> matiere) {
		this.matiere = matiere;
	}

}

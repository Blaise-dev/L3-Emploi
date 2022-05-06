package BusinessLayer.InterfacesBusiness;

import java.util.ArrayList;

import BusinessLayer.Enseignant;
import BusinessLayer.Matiere;

public interface IDepartement {

	public abstract String getCodeDepart();

	/**
	 *  
	 */
	public abstract String getNomDepart();

	public abstract void setCodeDepart(String codeDepart);

	/**
	 *  
	 */
	public abstract void setNomDepart(String nomDepart);

	public ArrayList<Matiere> getMatiere();

	public void setMatiere(ArrayList<Matiere> matiere);

	public ArrayList<Enseignant> getEnseignant();

	public void setEnseignant(ArrayList<Enseignant> enseignant);

}

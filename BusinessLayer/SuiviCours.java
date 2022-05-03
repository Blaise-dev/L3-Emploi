package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.IMatiere;
import BusinessLayer.InterfacesBusiness.ISalle;
import BusinessLayer.InterfacesBusiness.ISemestre;
import BusinessLayer.InterfacesBusiness.ISuiviCours;

public class SuiviCours implements ISuiviCours {

	private String heureDebut;

	private String heureFin;

	private String jour;

	private Matiere matiere;

	private Enseignant enseignant;

	private Salle salle;

	private Groupe groupe;

	private Semestre semestre;


	/**
	 * @see ISuiviCours#getHeureDebut()
	 *  
	 */
	public String getHeureDebut() {
		return null;
	}


	/**
	 * @see ISuiviCours#getHeureFin()
	 *  
	 */
	public String getHeureFin() {
		return null;
	}


	/**
	 * @see ISuiviCours#getJour()
	 *  
	 */
	public String getJour() {
		return null;
	}


	/**
	 * @see ISuiviCours#setHeureDebut(String)
	 *  
	 */
	public void setHeureDebut(String heure) {

	}


	/**
	 * @see ISuiviCours#setHeureFin(String)
	 *  
	 */
	public void setHeureFin(String heure) {

	}


	/**
	 * @see ISuiviCours#setJour(String)
	 *  
	 */
	public void setJour(String jour) {

	}


	@Override
	public IMatiere getMatiere() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ISalle getSalle() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ISemestre getSemestre() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public IGroupe getGroupe() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public IEnseignant getEnseignant() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setMatiere(IMatiere matiere) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSalle(ISalle salle) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSemestre(ISemestre semestre) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setGroupe(IGroupe groupe) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setEnseignant(IEnseignant enseignant) {
		// TODO Auto-generated method stub
		
	}

}

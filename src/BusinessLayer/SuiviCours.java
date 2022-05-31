package BusinessLayer;

import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.IMatiere;
import BusinessLayer.InterfacesBusiness.ISalle;
import BusinessLayer.InterfacesBusiness.ISemestre;
import BusinessLayer.InterfacesBusiness.ISuiviCours;

public class SuiviCours implements ISuiviCours {

	private String heureDebut;

	private String heureFin;

	private int jour;

	private IMatiere matiere;

	private IEnseignant enseignant;

	private ISalle salle;

	private IGroupe groupe;

	private ISemestre semestre;


	/**
	 * @see ISuiviCours#getHeureDebut()
	 *  
	 */
	public String getHeureDebut() {
		return heureDebut;
	}


	/**
	 * @see ISuiviCours#getHeureFin()
	 *  
	 */
	public String getHeureFin() {
		return heureFin;
	}


	/**
	 * @see ISuiviCours#getJour()
	 *  
	 */
	public int getJour() {
		return jour;
	}


	/**
	 * @see ISuiviCours#setHeureDebut(String)
	 *  
	 */
	public void setHeureDebut(String heure) {
		this.heureDebut = heure;
	}


	/**
	 * @see ISuiviCours#setHeureFin(String)
	 *  
	 */
	public void setHeureFin(String heure) {
		this.heureFin = heure;

	}


	/**
	 * @see ISuiviCours#setJour(String)
	 *  
	 */
	public void setJour(int jour) {
		this.jour = jour;

	}


	@Override
	public IMatiere getMatiere() {
		return matiere;
	}


	@Override
	public ISalle getSalle() {
		return salle;
	}


	@Override
	public ISemestre getSemestre() {
		return semestre;
	}


	@Override
	public IGroupe getGroupe() {
		return groupe;
	}


	@Override
	public IEnseignant getEnseignant() {
		// TODO Auto-generated method stub
		return enseignant;
	}


	@Override
	public void setMatiere(IMatiere matiere) {
		this.matiere = matiere;
		
	}


	@Override
	public void setSalle(ISalle salle) {
		this.salle = salle;
		
	}


	@Override
	public void setSemestre(ISemestre semestre) {
		this.semestre = semestre;
		
	}


	@Override
	public void setGroupe(IGroupe groupe) {
		this.groupe =groupe;
		
	}


	@Override
	public void setEnseignant(IEnseignant enseignant) {
		this.enseignant = enseignant;
		
	}

}

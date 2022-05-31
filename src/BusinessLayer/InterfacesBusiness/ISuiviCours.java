package BusinessLayer.InterfacesBusiness;

public interface ISuiviCours {

	/**
	 *  
	 */
	public abstract String getHeureDebut();

	/**
	 *  
	 */
	public abstract String getHeureFin();

	/**
	 *  
	 */
	public abstract int getJour();

	/**
	 *  
	 */
	public abstract IMatiere getMatiere();

	public abstract ISalle getSalle();

	/**
	 *  
	 */
	public abstract ISemestre getSemestre();

	/**
	 *  
	 */
	public abstract IGroupe getGroupe();

	/**
	 *  
	 */
	public abstract IEnseignant getEnseignant();

	/**
	 *  
	 */
	public abstract void setHeureDebut(String heure);

	/**
	 *  
	 */
	public abstract void setHeureFin(String heure);

	/**
	 *  
	 */
	public abstract void setJour(int jour);

	/**
	 *  
	 */
	public abstract void setMatiere(IMatiere matiere);

	public abstract void setSalle(ISalle salle);

	/**
	 *  
	 */
	public abstract void setSemestre(ISemestre semestre);

	/**
	 *  
	 */
	public abstract void setGroupe(IGroupe groupe);

	/**
	 *  
	 */
	public abstract void setEnseignant(IEnseignant enseignant);

}

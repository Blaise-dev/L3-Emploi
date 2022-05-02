package BusinessLayer.InterfacesBusiness;

public interface IAdministrateur {

	/**
	 *  
	 */
	public abstract void supprimerEtudiant(String matricule);

	/**
	 *  
	 */
	public abstract void modifierEtudiant(String matricule, String nouvMatricule, String nouvMdp, String nouvNom, String nouvPrenom, String nouvEmail, String nouvDateNais);

	/**
	 *  
	 */
	public abstract void supprimerEnseignant(String matricule);

	/**
	 *  
	 */
	public abstract void modifierEnseignant(String matricule, String nouvMatricule, String nouvMdp, String nouvNom, String nouvPrenom, String nouvEmail, String nouvDateNais, String nouvGradeEns);

	/**
	 *  
	 */
	public abstract void supprimerSuivi(String matriculeEns, String codeSalle, String codeGrp, String codeMat, String codeSem);

	/**
	 *  
	 */
	public abstract void modifierSuivi(String matriculeEns, String codeSalle, String codeGrp, String codeMat, String codeSem, String nouvMatriculeEns, String nouvCodeSalle, String nouvCodeGrp, String nouvCodeMat, String nouvCodeSem);

}

package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.*;


public interface ISelectDAO {

	public abstract String selPass(String login);

	public abstract ISalle selSalle(ISalle salle);

	public abstract IFiliere selFiliere(IFiliere filiere);

	public abstract IGroupe selGroupe(IGroupe groupe);

	public abstract INiveau selNiveau(INiveau niveau);

	public abstract ISemestre selSemestre(ISemestre semestre);

	public abstract IAnnee selAnnee(IAnnee annee);

	public abstract IMatiere selMatiere(IMatiere matiere);

	public abstract IDepartement selDepartement(IDepartement dpt);

	public abstract IEnseignant selEnseignant(IEnseignant ens);

	public abstract IAdministrateur selAdministrateur(IAdministrateur admin);

	public abstract IEtudiant selEtudiant(IEtudiant etudiant);

	public abstract ISuiviCours selSuivi(ISuiviCours suivi);

}

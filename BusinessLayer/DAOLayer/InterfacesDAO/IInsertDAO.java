package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.*;

public interface IInsertDAO {

	
	public abstract void insertUser(IUtilisateur usr);

	public abstract void insertSalle(ISalle salle);

	public abstract void insertFiliere(IFiliere filiere);

	public abstract void insertGroupe(IGroupe grp);

	public abstract void insertNiveau(INiveau nivveau);

	public abstract void insertSemestre(ISemestre semestre);

	public abstract void insertAnnee(IAnnee annee);

	public abstract void insertMatiere(IMatiere matiere);

	public abstract void insertDepartement(IDepartement dpt);

	public abstract void insertEnseignant(IEnseignant ens);

	public abstract void insertAdministrateur(IAdministrateur admin);

	public abstract void insertEtudiant(IEtudiant etudiant);

	public abstract void insertSuivi(ISuiviCours suiviCour);

}

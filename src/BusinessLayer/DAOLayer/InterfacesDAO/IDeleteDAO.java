package BusinessLayer.DAOLayer.InterfacesDAO;

import BusinessLayer.InterfacesBusiness.*;

public interface IDeleteDAO {

	public abstract void deltUser(IUtilisateur usr);

	public abstract void delSalle(ISalle salle);

	public abstract void delFliere(IFiliere filiere);

	public abstract void delGroupe(IGroupe grp);

	public abstract void delNiveau(INiveau nivveau);

	public abstract void delSemestre(ISemestre semestre);

	public abstract void delAnnee(IAnnee annee);

	public abstract void delMatiere(IMatiere matiere);

	public abstract void delDepartement(IDepartement dpt);

	public abstract void delEnseignant(IEnseignant ens);

	public abstract void delAdministrateur(IAdministrateur admin);

	public abstract void delEtudiant(IEtudiant etudiant);

	public abstract void delSuivi(ISuiviCours suiviCour);

}

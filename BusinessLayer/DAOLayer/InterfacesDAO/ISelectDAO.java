package BusinessLayer.DAOLayer.InterfacesDAO;

import java.util.Collection;
import java.util.List;

import BusinessLayer.InterfacesBusiness.*;

public interface ISelectDAO {

	public abstract void selUser(IUtilisateur usr);

	public abstract void selSalle(ISalle salle);

	public abstract void selFiliere(IFiliere filiere);

	public abstract void selGroupe(IGroupe groupe);

	public abstract void selNiveau(INiveau niveau);

	public abstract void selSemestre(ISemestre semestre);

	public abstract void selAnnee(IAnnee annee);

	public abstract void selMatiere(IMatiere matiere);

	public abstract void selDepartement(IDepartement dpt);

	public abstract void selEnseignant(IEnseignant ens);

	public abstract void selAdministrateur(IAdministrateur admin);

	public abstract void selEtudiant(IEtudiant etudiant);

	public abstract List<?> selSuivi(ISuiviCours suivi);

}

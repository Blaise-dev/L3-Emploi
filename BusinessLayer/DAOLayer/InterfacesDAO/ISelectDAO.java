package BusinessLayer.DAOLayer.InterfacesDAO;

import java.util.ArrayList;
import java.util.HashMap;

import BusinessLayer.InterfacesBusiness.*;

public interface ISelectDAO {

	public void selUser(IUtilisateur usr);

	public void selSalle(ISalle salle);

	public void selFiliere(IFiliere filiere);

	public void selGroupe(IGroupe groupe);

	public void selNiveau(INiveau niveau);

	public void selSemestre(ISemestre semestre);

	public void selAnnee(IAnnee annee);

	public void selMatiere(IMatiere matiere);

	public void selDepartement(IDepartement dpt);

	public void selEnseignant(IEnseignant ens);

	public void selAdministrateur(IAdministrateur admin);

	public void selEtudiant(IEtudiant etudiant);

	public ArrayList<HashMap<String, String>> selSuiviEtudiant(IEtudiant etudiant);

	public ArrayList<HashMap<String, String>> selSuiviEnseignant(IEnseignant enseignant);

}

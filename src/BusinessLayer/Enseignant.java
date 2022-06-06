package BusinessLayer;

import BusinessLayer.DAOLayer.InterfacesDAO.ISelectDAO;
import BusinessLayer.DAOLayer.SelectDAO;
import BusinessLayer.InterfacesBusiness.IAnnee;
import java.util.List;

import BusinessLayer.InterfacesBusiness.IDepartement;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IFiliere;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.IMatiere;
import BusinessLayer.InterfacesBusiness.INiveau;
import BusinessLayer.InterfacesBusiness.ISalle;
import BusinessLayer.InterfacesBusiness.ISemestre;
import BusinessLayer.InterfacesBusiness.ISuiviCours;
import BusinessLayer.InterfacesBusiness.IUtilisateur;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Enseignant extends Utilisateur implements IEnseignant {

	private String gradeEns;

	private String codeDepartement;

	private IDepartement departement;

	private List<ISuiviCours> suiviCours;


	/**
	 * @see BusinessLayer.IEnseignant#getGradeEns()
	 *  
	 */
	public String getGradeEns() {
		return gradeEns;
	}


	/**
	 * @see BusinessLayer.IEnseignant#setGradeEns(String)
	 *  
	 */
	public void setGradeEns(String gradeEns) {
		this.gradeEns = gradeEns;

	}


	@Override
	public IDepartement getDepartement() {
		return departement;
	}


	@Override
	public void setDepartement(IDepartement dpt) {
		this.departement = dpt;
		
	}


	@Override
	public List<ISuiviCours> getSuiviCours() {
		return suiviCours;
	}

	@Override
	public void setSuiviCours() {
		ISelectDAO sel = new SelectDAO();
		sel.selEnseignant(this);
		ArrayList<HashMap<String, String>> result = sel.selSuiviEnseignant(this);
		ISuiviCours suivi = null;
		suiviCours = new ArrayList<>();
		for(HashMap<String, String> cours: result) {
			suivi = new SuiviCours();

			IMatiere matiere = new Matiere();
			matiere.setCodeMat(cours.get("codeMatiere"));
			sel.selMatiere(matiere);
			IDepartement department = new Departement();
			matiere.setDepartement(department);
			department.setCodeDepart(matiere.getCodeDepartement());
			sel.selDepartement(department);
			suivi.setMatiere(matiere);

			IEnseignant enseignant = new Enseignant();
			enseignant.setMatricule(cours.get("matricule"));
			sel.selEnseignant(enseignant);
			IDepartement dpt = new Departement();
			enseignant.setDepartement(dpt);
			dpt.setCodeDepart(enseignant.getCodeDepartement());
			sel.selDepartement(dpt);
			suivi.setEnseignant(enseignant);

			ISalle salle = new Salle();
			salle.setCodeSalle(cours.get("codeSalle"));
			sel.selSalle(salle);
			suivi.setSalle(salle);

			ISemestre semestre = new Semestre();
			semestre.setIdSem(Integer.parseInt(cours.get("idSem")));
			sel.selSemestre(semestre);
			IAnnee annee = new Annee();
			semestre.setAnnee(annee);
			annee.setIdAnnee(semestre.getIdAnnee());
			sel.selAnnee(annee);
			suivi.setSemestre(semestre);

			IGroupe grp = new Groupe();
			grp.setIdGrp(Integer.parseInt(cours.get("idGrp")));
			sel.selGroupe(grp);
			INiveau niv = new Niveau();
			grp.setNiveau(niv);
			niv.setIdNiv(grp.getIdNiveau());
			sel.selNiveau(niv);
			IFiliere fil = new Filiere();
			fil.setCodeFil(niv.getCodeFiliere());
			sel.selFiliere(fil);
			suivi.setGroupe(grp);

			suivi.setHeureDebut(cours.get("heureDebut"));
			suivi.setHeureFin(cours.get("heureFin"));
			suivi.setJour(Integer.parseInt(cours.get("jour")));
			suiviCours.add(suivi);
		}
		
	}


	/**
	 * @see Enseignant#getTimeTable()
	 */
	public HashMap<String, List<ISuiviCours>> getTimeTable() {
            HashMap<String, List<ISuiviCours>> timeTable = new HashMap<String, List<ISuiviCours>>();
            String key = "";
            final int NOMBRE_JOURS = 7;
            int i;
            for(ISuiviCours suivi: this.getSuiviCours()) {
                key = suivi.getHeureDebut().replace(":", "h")+"-"+suivi.getHeureFin().replace(":", "h");
                if(!timeTable.containsKey(key)) {
                    timeTable.put(key, new ArrayList<>());
                }
                timeTable.get(key).add(suivi);
            }

            for(String cle : timeTable.keySet()) {
                i = 0;
                while(timeTable.get(cle).size() < NOMBRE_JOURS) {
                    if(i >= timeTable.get(cle).size() || timeTable.get(cle).get(i).getJour() != i+1) {
                        timeTable.get(cle).add(i, null);
                    }
                    i++;
                }
            }
            Map sortedTimeTable = new TreeMap(timeTable);
            Set set = sortedTimeTable.entrySet();
            Iterator iterator = set.iterator();
            while(iterator.hasNext()) {
                Map.Entry me = (Map.Entry)iterator.next();
                timeTable.put(""+me.getKey(), (List<ISuiviCours>)me.getValue());
            }
            return timeTable;
	}

	@Override
	public String getCodeDepartement() {
		// TODO Auto-generated method stub
		return codeDepartement;
	}


	@Override
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
		
	}


	/**
	 * @see Enseignant#fillEns(IUtilisateur)
	 */
	public void fillEns(IUtilisateur usr) {
                this.setMatricule(usr.getMatricule());
		ISelectDAO select = new SelectDAO();
                select.selEnseignant(this);
                this.setSuiviCours();

                this.setDepartement(new Departement());
		this.getDepartement().setCodeDepart(this.getCodeDepartement());
		select.selDepartement(this.getDepartement());
	}

	/**
	 * @see Etudiant#fillEtd(IUtilisateur)
	 */
	public ArrayList<IEnseignant> getColleagues() {
		ISelectDAO select = new SelectDAO();
                return select.selColleagues(this);
	}
}

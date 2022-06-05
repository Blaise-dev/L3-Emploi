package BusinessLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import BusinessLayer.DAOLayer.SelectDAO;
import BusinessLayer.DAOLayer.InterfacesDAO.ISelectDAO;
import BusinessLayer.InterfacesBusiness.IAnnee;
import BusinessLayer.InterfacesBusiness.IDepartement;
import BusinessLayer.InterfacesBusiness.IEnseignant;
import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IFiliere;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.IMatiere;
import BusinessLayer.InterfacesBusiness.INiveau;
import BusinessLayer.InterfacesBusiness.ISalle;
import BusinessLayer.InterfacesBusiness.ISemestre;
import BusinessLayer.InterfacesBusiness.ISuiviCours;
import BusinessLayer.InterfacesBusiness.IUtilisateur;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Etudiant extends Utilisateur implements IEtudiant {

	private int idGrp;

	private IGroupe groupe;

	private List suiviCours;

	@Override
	public int getIdGrp() {
		return idGrp;
	}

	@Override
	public void setIdGrp(int idGrp) {
		this.idGrp = idGrp;
		
	}

	@Override
	public IGroupe getGroupe() {
		return groupe;
	}

	@Override
	public void setGroupe(IGroupe groupe) {
		this.groupe = groupe;
	}

	@Override
	public List<ISuiviCours> getSuiviCours() {
		return suiviCours;
	}

	@Override
	// On se sert de la m�thode selSuiviEtudiant de l'interface ISelectDAO pour r�cup�rer les suivis
	// d'un �tudiant dans la BD. La m�thode va retourner une liste de listes de chaines de caract�res.
	// Il faudra la transformer en une liste de SuiviCours.
	public void setSuiviCours() {
		ISelectDAO sel = new SelectDAO();
		sel.selEtudiant(this);
		ArrayList<HashMap<String, String>> result = sel.selSuiviEtudiant(this);
		ISuiviCours suivi = null;
		suiviCours = new ArrayList<SuiviCours>();
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
			enseignant.setSuiviCours();
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
	 * @see Etudiant#fillEtd(IUtilisateur)
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

	/**
	 * @see Etudiant#fillEtd(IUtilisateur)
	 */
	public void fillEtd(IUtilisateur usr) {
                this.setMatricule(usr.getMatricule());
		ISelectDAO select = new SelectDAO();
                select.selEtudiant(this);
                this.setSuiviCours();

                this.setGroupe(new Groupe());
		this.getGroupe().setIdGrp(this.getIdGrp());
		select.selGroupe(this.getGroupe());

                this.getGroupe().setNiveau(new Niveau());
		this.getGroupe().getNiveau().setIdNiv(this.getGroupe().getIdNiveau());
		select.selNiveau(this.getGroupe().getNiveau());

                this.getGroupe().getNiveau().setFiliere(new Filiere());
		this.getGroupe().getNiveau().getFiliere().setCodeFil(this.getGroupe().getNiveau().getCodeFiliere());
		select.selFiliere(this.getGroupe().getNiveau().getFiliere());
	}

	/**
	 * @see Etudiant#fillEtd(IUtilisateur)
	 */
	public ArrayList<IEtudiant> getComrades() {
		ISelectDAO select = new SelectDAO();
                return select.selComrades(this);
	}

}
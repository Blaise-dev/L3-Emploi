package BusinessLayer;

import java.util.Collection;
import java.util.List;

import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IGroupe;
import BusinessLayer.InterfacesBusiness.ISuiviCours;

public class Etudiant extends Utilisateur implements IEtudiant {

	private int idGrp;

	private Groupe groupe;

	private List<SuiviCours> suiviCours;;

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
	public void setSuiviCours(IEtudiant etudiant) {
		this.etudiant = etudiant;
		
	}

}

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setIdGrp(int idGrp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IGroupe getGroupe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGroupe(IGroupe groupe) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<ISuiviCours> getSuiviCours() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSuiviCours(IEtudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

}

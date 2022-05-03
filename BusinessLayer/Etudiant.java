package BusinessLayer;

import java.util.Collection;

import BusinessLayer.InterfacesBusiness.IEtudiant;
import BusinessLayer.InterfacesBusiness.IGroupe;

public class Etudiant extends Utilisateur implements IEtudiant {

	private int idGrp;

	private Groupe groupe;

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

}

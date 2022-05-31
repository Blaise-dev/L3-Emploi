package BusinessLayer.InterfacesBusiness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface IEtudiant extends IUtilisateur {

	/**
	 *  
	 */
	public abstract int getIdGrp();

	/**
	 *  
	 */
	public abstract IGroupe getGroupe();

	/**
	 *  
	 */
	public abstract List<ISuiviCours> getSuiviCours();

	/**
	 *  
	 */
	public abstract void setIdGrp(int idGrp);

	/**
	 *  
	 */
	public abstract void setGroupe(IGroupe groupe);

	/**
	 *  
	 */
	public abstract void setSuiviCours();

	/**
	 *  
	 */
        public abstract void fillEtd(IUtilisateur usr);

	/**
	 *  
	 */
        public abstract HashMap<String, List<ISuiviCours>> getTimeTable();

	/**
	 *  
	 */
        public abstract ArrayList<IEtudiant> getComrades();

}

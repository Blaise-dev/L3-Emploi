package BusinessLayer.InterfacesBusiness;

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
	public abstract void setIdGrp(int idGrp);

	/**
	 *  
	 */
	public abstract void setGroupe(IGroupe groupe);

}

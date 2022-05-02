import BusinessLayer.Filiere;
import BusinessLayer.InterfacesBusiness.IFiliere;

public class Main {
	public static void main(String[] args) {
		System.out.print("Hi");
		IFiliere filiere = new Filiere();
		filiere.getNomFil();
	}
}

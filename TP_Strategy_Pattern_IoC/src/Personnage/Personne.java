package Personnage;
import Arme.IArme;

public abstract class Personne {

	 public IArme arme;

	 public abstract void Combattre();

	public void setArme(IArme arme) {
		this.arme = arme;
	}


}

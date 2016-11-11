package Personnage;

public class Troll  extends Personne{

	@Override
	public void Combattre() {
		System.out.println("Troll Puissant");
		arme.utiliserArme();
	}

}

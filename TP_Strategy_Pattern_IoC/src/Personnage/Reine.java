package Personnage;

public class Reine extends Personne {

	@Override
	public void Combattre() {
		System.out.println("Reine Suppreme");
		arme.utiliserArme();
	}

}

package Personnage;

public class Chevalier extends Personne {

	@Override
	public void Combattre() {
		System.out.println("Chevalier courageux");
		arme.utiliserArme();
	}

}

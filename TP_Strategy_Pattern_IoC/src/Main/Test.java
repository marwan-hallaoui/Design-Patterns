package Main;

import Arme.ComportementArcEtFleches;
import Arme.ComportementHache;
import Arme.IArme;
import Personnage.Personne;
import Personnage.Roi;

public class Test {

	public static void main(String[] args) {
		Personne p = new Roi();

		IArme gen = new ComportementHache();
		p.setArme(gen);
		p.Combattre();

		System.out.println("Changement d'arme");

		gen= new ComportementArcEtFleches();
		p.setArme(gen);
        p.Combattre();



	}

}

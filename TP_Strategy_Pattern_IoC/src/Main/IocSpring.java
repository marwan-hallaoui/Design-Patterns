package Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Personnage.Personne;

public class IocSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf=new ClassPathXmlApplicationContext(new String[]{"springIOC.xml"});
		Personne p1=(Personne) bf.getBean("personnage1");
		p1.Combattre();
		System.out.println("");
		Personne p2=(Personne) bf.getBean("personnage2");
		p2.Combattre();

	}

}

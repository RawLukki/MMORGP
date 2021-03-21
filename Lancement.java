package tp5poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lancement {

	@Test
	void test() {
		Archer a = new Archer("Pull up");
		Archer b = new Archer("Pull up's brother");
		Magician m = new Magician("Your dream");
		
		System.out.println(a.getNom() + " : " + a.getPv());
		System.out.println(m.getNom() + " : " + m.getPv());
		System.out.println();
		
		a.prendreArme();
		m.prendreArme();
		
		a.crie();
		a.attaquer(m);
		System.out.println();
		
		System.out.println(a.getNom() + " : " + a.getPv());
		System.out.println(m.getNom() + " : " + m.getPv());
		System.out.println();
		
		m.crie();
		m.attaquer(a);
		System.out.println();
		
		System.out.println(a.getNom() + " : " + a.getPv());
		System.out.println(m.getNom() + " : " + m.getPv());
		System.out.println();
		
		System.out.println(b.getNom() + " : " + b.getPv());
		System.out.println(m.getNom() + " : " + m.getPv());
		System.out.println();
		
		m.perdreArme();
		
		b.crie();
		b.attaquer(m);
		System.out.println();
		
		System.out.println(b.getNom() + " : " + b.getPv());
		System.out.println(m.getNom() + " : " + m.getPv());
		System.out.println();
		
		m.crie();
		m.attaquer(b);
		System.out.println();
		
		System.out.println(b.getNom() + " : " + b.getPv());
		System.out.println(m.getNom() + " : " + m.getPv());
		System.out.println();
		
		b.ultimate();
		b.attaquer(m);
		System.out.println();
		
		
	}

}

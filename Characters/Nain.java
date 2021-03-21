package tp5poo;

public class Nain extends Combattants {

	public Nain(String n) {
		super(n, 50, 20, 30);
		
	}
	
	public void prendreArme() {
		Hache h = new Hache();
		super.arme=h;
	}

	
	
}

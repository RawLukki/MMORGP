package tp5poo;

public class Magician extends Combattants{

	public Magician(String n) {
		super(n, 40, 30, 10);
		
	}
	
	public void prendreArme() {
		Baguette b = new Baguette();
		super.arme=b;
	}
	
	public void crie() {
		System.out.println("Flamme d'udun !");
	}

}

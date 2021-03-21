package tp5poo;

public class Archer extends Combattants {

	public Archer(String n) {
		super(n, 30, 10, 20);
	}
	
	public void prendreArme() {
		Arc a = new Arc();
		super.arme=a;
	}
	
	public void crie() {
		System.out.println("Que ma flèche pénètre ton âme !");
	}
	
	public void ultimate() {
		super.ptsAtt*=10;
		System.out.println("Tu vas goûter à ma flèche millénaire");
		
	}

}

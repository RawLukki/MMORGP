package tp5poo;

public class Combattants {

	private String nom;
	private int pv;
	protected int ptsAtt;
	private int ptsDef;
	protected Arme arme;
	
	public Combattants(String n,int ptsVie,int ptAtt,int ptDef) {
		this.nom = n;
		this.pv=ptsVie;
		this.ptsAtt=ptAtt;
		this.ptsDef=ptDef;
		this.arme=null;
		
	}
	
	public void perdreArme() {
		this.arme = null;
	}
	
	public boolean perdrePV(int degats){
		int puissance = degats - this.ptsDef;
		boolean enVie = true;
		if(puissance<=0) {
			System.out.println("L'attaque n'a fait aucun dégâts");;
		}
		
		else {
			this.pv -= puissance;
		}
		
		if(this.pv <=0) {
			enVie = false;
		}
		
		return enVie;
	}
	
	public void attaquer(Combattants a) {
		int attaque;
		
		if(this.arme==null) {
			attaque = this.ptsAtt;
		}
		
		else {
			attaque = this.ptsAtt + this.arme.getAtt();
			
		}
		
		
		
		System.out.println(this.nom + " attaque " + a.getNom() + " avec une puissance d'attaque de " + this.ptsAtt);
		System.out.println(this.nom + " a une défense de " + this.ptsDef);
		
		if(!a.perdrePV(attaque)) {
			System.out.println( a.getNom() + " est à terre !");
		}
	
	}
	
	public int getPv() {
		return this.pv;
	}
	
	public int getAtt() {
		return this.ptsAtt;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	
	
	
}


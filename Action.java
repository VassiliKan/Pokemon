
public class Action {

	private String nom;
	
	private int degats;
	
	private int cout;

	public Action(String nom, int degats, int cout) {
		this.nom = nom;
		this.degats = degats;
		this.cout = cout;
	}

	public int getDegats() {
		return this.degats;
	}

	@Override
	public String toString() {
		return "Attaque " + this.nom + " :\n\tDegat : " + this.degats + "\n\tCout : " + this.cout;
	}
	
	
}

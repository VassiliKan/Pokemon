
public abstract class Pokemon {

	private int pv;
	
	private float poids, taille;
	
	private String type;
	
	public Pokemon(int pv, String type, float poids, float taille) {
		this.pv = pv;
		this.type = type;
		this.poids = poids;
		this.taille = taille;
	}
	
	public abstract Action action1();
	
	public abstract Action action2();

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " : \n PV : " + this.pv + "\n Poids : " 
		+ this.poids + " kg \n Taille : " + this.taille + " m \n Type : " + this.type + "\n";
	}


	public void retirerPv (Action action) {
		this.pv -= action.getDegats();
	}
	
	public void setPv(int pv) {
		this.pv = pv;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

}

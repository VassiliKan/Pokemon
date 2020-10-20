
public class Reptincel extends Salameche {
	
	Action action1;
	Action action2;
	
	public Reptincel() {
		super();
		this.setPv(80);
		this.setPoids(19f);
		this.setTaille(1.1f);
	}
	
	@Override
	public Action action1() {
		return action1 = new Action("Tranch'Griffe", 30, 2);
	}

	@Override
	public Action action2() {
		return action2 = new Action("Explosion de Chaleur", 50, 3);
	}
	
	

}


public class Carabaffe extends Carapuce {
	
	Action action1;
	Action action2;
	
	public Carabaffe() {
		super();
		this.setPv(90);
		this.setPoids(22.5f);
		this.setTaille(1f);
	}
	
	@Override
	public Action action1() {
		return action1 = new Action("Ecume", 40, 1);
	}

	@Override
	public Action action2() {
		return action2 = new Action("Charge", 50, 2);
	}
	

}

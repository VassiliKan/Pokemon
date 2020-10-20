
public class Carapuce extends Pokemon {

	Action action1;
	Action action2;

	public Carapuce() {
		super(60, "Eau", 9f, 0.5f);
	}

	@Override
	public Action action1() {
		return action1 = new Action("Charge", 10, 1);
	}

	@Override
	public Action action2() {
		return action1 = new Action("Pluie Eclaboussante", 20, 1);
	}


	
}

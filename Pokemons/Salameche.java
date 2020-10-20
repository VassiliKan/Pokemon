
public class Salameche extends Pokemon {

	Action action1;
	Action action2;

	public Salameche() {
		super(70, "Feu", 8.5f, 0.6f);
	}

	@Override
	public Action action1() {
		return action1 = new Action("Griffe", 10, 1);
	}

	@Override
	public Action action2() {
		return action1 = new Action("Flammeche", 30, 2);
	}


	
}
package machine;

public class AddExec extends Operation {

	public AddExec(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x+y;
	}

}
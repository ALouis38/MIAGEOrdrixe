package machine;

public class Div extends Operation {

	public Div(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x/y;
	}

}

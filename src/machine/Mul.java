package machine;

public class Mul extends Operation {

	public Mul(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x*y;
	}

}

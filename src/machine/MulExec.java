package machine;

public class MulExec extends Operation {

	public MulExec(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x*y;
	}

}

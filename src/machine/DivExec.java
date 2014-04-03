package machine;

public class DivExec extends Operation {

	public DivExec(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x/y;
	}

}

package machine;

public class SubExec extends Operation {

	public SubExec(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x-y;
	}

}

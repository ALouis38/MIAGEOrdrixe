package machine;

public class Add extends Operation {

	public Add(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x+y;
	}

}
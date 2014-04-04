package machine;

public class Sub extends Operation {

	public Sub(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x-y;
	}

}

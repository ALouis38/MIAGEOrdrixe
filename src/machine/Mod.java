package machine;

public class Mod extends Operation {

	public Mod(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x%y;
	}

}

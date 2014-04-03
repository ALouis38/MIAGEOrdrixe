package machine;

public class ModExec extends Operation {

	public ModExec(Processeur p) {
		super(p);
	}

	@Override
	protected int calcul(int x, int y) {
		return x%y;
	}

}

package machine;
import machine.Processeur.Instruct;

public class Dat extends Instruct {

	public Dat(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		// retourne un compteur ordinal de -1 pour signaler la fin du programme
		compteurOrdinal(-1);
	}

}

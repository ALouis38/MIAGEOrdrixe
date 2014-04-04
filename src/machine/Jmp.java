package machine;

import machine.Processeur.Instruct;

public class Jmp extends Instruct {

	public Jmp(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		compteurOrdinal(e1());
	}

}

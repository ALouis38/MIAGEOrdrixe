package machine;

import machine.Processeur.Instruct;

public class JmpExec extends Instruct {

	public JmpExec(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		compteurOrdinal(e1());
	}

}

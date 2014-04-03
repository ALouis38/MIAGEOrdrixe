package machine;

import machine.Processeur.Instruct;

public class JmzExec extends Instruct {

	public JmzExec(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		if(memoire().instruction(e2()).op2().valeur() == 0){
			compteurOrdinal(e1());
		}
	}

}

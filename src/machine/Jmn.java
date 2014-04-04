package machine;

import machine.Processeur.Instruct;

public class Jmn extends Instruct {

	public Jmn(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		if(memoire().instruction(e2()).op2().valeur() != 0){
			compteurOrdinal(e1());
		}
	}

}

package machine;

import machine.Processeur.Instruct;

public class SltExec extends Instruct {

	public SltExec(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		// adressage immediat
		if (registreInstruction().op1().adressage().equals("#")) {
			int a = memoire().instruction(e1()).op1().valeur();
			int b = memoire().instruction(e2()).op2().valeur();
			if (a < b) {
				compteurOrdinal(compteurOrdinal() + 1);
			}
		}
		// adressage relatif
		else {
			int a = memoire().instruction(e1()).op2().valeur();
			int b = memoire().instruction(e2()).op2().valeur();
			if (a < b) {
				compteurOrdinal(compteurOrdinal() + 1);
			}
		}
	}
}

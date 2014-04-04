package machine;

import machine.Processeur.Instruct;

public class Slt extends Instruct {

	public Slt(Processeur p) {
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

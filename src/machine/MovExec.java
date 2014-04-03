package machine;

import instructions.operations.Instruction;
import machine.Processeur.Instruct;

public class MovExec extends Instruct {

	public MovExec(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {

		// adressage immediat
		if (registreInstruction().op1().adressage().equals("#")) {
			int v = memoire().instruction(e1()).op1().valeur();
			memoire().instruction(e2()).op2().valeur(v);
		}
		// adressage relatif et relatif indirect
		else {
			memoire().instruction(e2(), memoire().instruction(e1()));
		}
	}

}

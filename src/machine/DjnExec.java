package machine;

import instructions.operations.Instruction;
import machine.Processeur.Instruct;

public class DjnExec extends Instruct {

	public DjnExec(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		// adressage immédiat
		if(registreInstruction().op2().adressage().equals("#")){
			if(memoire().instruction(e2()).op2().valeur() != 0){
				compteurOrdinal(e1());
			}
		}
		// adressage relatif
		else{
			int v = memoire().instruction(e2()).op2().valeur() -1;
			memoire().instruction(e2()).op2().valeur(v);
		}
	}

}

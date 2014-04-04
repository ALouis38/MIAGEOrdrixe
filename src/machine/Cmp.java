package machine;

import machine.Processeur.Instruct;

public class Cmp extends Instruct {

	public Cmp(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		// adressage immédiat
		if(registreInstruction().op1().adressage().equals("#")){
			int a = memoire().instruction(e1()).op1().valeur();
			int b = memoire().instruction(e2()).op2().valeur();
			if(a == b){
				compteurOrdinal(compteurOrdinal()+1);;
			}
		}
		// adressage relatif
		else {
			if (memoire().instruction(e1()) == memoire().instruction(e2())){
				compteurOrdinal(compteurOrdinal()+1);;
			}
		}
	}

}

package machine;

import instructions.operations.Instruction;
import machine.Processeur.Instruct;

public abstract class Operation extends Instruct {

	public Operation(Processeur p) {
		p.super();
	}

	@Override
	protected void operer() {
		Instruction i1, i2;
		i1 = memoire().instruction(e2());
		i2 = memoire().instruction(e1());
		int v1, v2, v3, v4;
		if(i1.op1().adressage().symbole().equals("#")){
			v1 = i2.op2().valeur();
			v2 = i1.op1().valeur();
			i2.op2().valeur(calcul(v1,v2));
		}else{
			v1=i2.op1().valeur();
			v2=i1.op1().valeur();
			v3=i2.op2().valeur();
			v4=i1.op2().valeur();
			i2.op1().valeur(calcul(v1,v2));
			i2.op2().valeur(calcul(v3,v4));		
		}
		memoire().instruction(e2(), i2);
	}
	protected abstract int calcul(int x, int y);

}
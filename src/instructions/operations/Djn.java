package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Djn extends Branchement {
	
	/**
	 * Constructeur avec etiquette + 2 op
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Djn(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}
	
	/**
	 * Constructeur avec 2 op
	 * @param op1
	 * @param op2
	 */
	public Djn(Operande op1, Operande op2) {
		super(op1, op2);
	}

	@Override
	public int executeBr() {
		if(op2().valeur()-1 == 0)
			return op1().valeur();
		else
			return -1;
	}

}

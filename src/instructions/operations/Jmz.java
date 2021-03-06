package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Jmz extends Instruction {

	/**
	 * Constructeur avec etiquette + 2 op
	 * @param etiquette
	 * @param op2
	 */
	public Jmz(Etiquette etiquette,Operande op1 , Operande op2) {
		super(etiquette, op1, op2);
	}
	
	/**
	 * Constructeur avec 2 op
	 * @param op2
	 */
	public Jmz(Operande op1, Operande op2) {
		super(op1, op2);
	}

}

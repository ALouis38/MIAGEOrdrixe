package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Jmn extends Instruction {
	
	/**
	 * Constructeur avec etiquette + 2 op
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Jmn(Etiquette etiquette,Operande op1 , Operande op2) {
		super(etiquette, op1, op2);
	}
	
	/**
	 * Constructeur avec 2 op
	 * @param op1
	 * @param op2
	 */
	public Jmn(Operande op1, Operande op2) {
		super(op1, op2);
	}

}

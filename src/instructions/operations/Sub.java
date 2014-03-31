package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Sub extends Instruction {
	
	/**
	 * Constructeur d'une instruction avec deux opérandes
	 * @param op1
	 * @param op2
	 */
	public Sub(Operande op1, Operande op2) {
		super(op1, op2);
	}
	
	/**
	 * Constructeur d'une instruction avec etiquette et deux opérandes
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Sub(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}

}

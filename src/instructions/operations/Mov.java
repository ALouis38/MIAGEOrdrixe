package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Mov extends Instruction {

	/**
	 * Constructeur avec etiquette
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Mov(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}

	/**
	 * Constructeur sans etiquette
	 * @param op1
	 * @param op2
	 */
	public Mov(Operande op1, Operande op2) {
		super(op1, op2);
	}

}

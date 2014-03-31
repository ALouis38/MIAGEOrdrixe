package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Jmp extends Instruction {
	
	/**
	 * Constructeur Jmp avec etiquette + op
	 * @param etiquette
	 * @param op2
	 */
	public Jmp(Etiquette etiquette, Operande op2) {
		super(etiquette, op2);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur
	 * Jmp avec op
	 * @param op2
	 */
	public Jmp(Operande op2) {
		super(op2);
		// TODO Auto-generated constructor stub
	}

}

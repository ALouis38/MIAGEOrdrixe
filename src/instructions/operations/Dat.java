package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Dat extends Instruction {

	/**
	 * constructeur etiquette + op2
	 * @param etiquette
	 * @param op2
	 */
	public Dat(Etiquette etiquette, Operande op2) {
		super(etiquette, op2);
	}
	
	/**
	 * constructeur etiquette + 2 op�randes
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Dat(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}
	
	/**
	 * constructeur une op�rande
	 * @param op2
	 */
	public Dat(Operande op2) {
		super(op2);
	}
	
	/**
	 * constructeur 2 op�randes
	 * @param op1
	 * @param op2
	 */
	public Dat(Operande op1, Operande op2) {
		super(op1, op2);
	}

	@Override
	public boolean execute() {
		// fin du processus, retourne false
		return false;
	}

}

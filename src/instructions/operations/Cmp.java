package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Cmp extends Branchement {
	
	/**
	 * Constructeur avec etiquette + 2 op
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Cmp(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}
	
	/**
	 * Constructeur avec 2 op
	 * @param op1
	 * @param op2
	 */
	public Cmp(Operande op1, Operande op2) {
		super(op1, op2);
	}

	@Override
	public int executeBr() {
		if(op1().valeur() == op2().valeur())
			return -1; // PC ++
		else
			return -2; // PC = PC + 2
	}

}

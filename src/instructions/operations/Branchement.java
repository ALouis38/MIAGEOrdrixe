package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public abstract class Branchement extends Instruction {

	/**
	 * constructeur d'un branchement avec etiquette + 1 op
	 * @param etiquette
	 * @param op2
	 */
	public Branchement(Etiquette etiquette, Operande op2) {
		super(etiquette, op2);
	}
	
	/**
	 * constructeur d'un branchement avec etiquette + 2 op
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Branchement(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}
	
	/**
	 * constructeur d'un branchement avec 1 op
	 * @param op2
	 */
	public Branchement(Operande op2) {
		super(op2);
	}
	
	/**
	 * constructeur d'un branchement avec 2 op
	 * @param op1
	 * @param op2
	 */
	public Branchement(Operande op1, Operande op2) {
		super(op1, op2);
	}

	@Override
	public boolean execute() {
		return true;
	}
	
	/**
	 * Execution du branchement, compteur ordinal en paramètre
	 * @param compteurOrdinal
	 * @return
	 */
	public abstract int executeBr();

}

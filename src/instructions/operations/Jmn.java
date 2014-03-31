package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Jmn extends Branchement {
	
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

	@Override
	public int executeBr() {
		if(op2().valeur() != 0)
			// si op2 != 0, compteur ordinal == op1
			return op1().valeur();
		else
			// sinon, compteur ordinal ++
			return -1;
	}

}

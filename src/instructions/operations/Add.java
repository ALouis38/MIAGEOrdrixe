package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public class Add extends Instruction {
	
	/**
	 * Constructeur d'une instruction avec deux opérandes
	 * @param op1
	 * @param op2
	 */
	public Add(Operande op1, Operande op2) {
		super(op1, op2);
	}
	
	/**
	 * Constructeur d'une instruction avec etiquette et deux opérandes
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Add(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}

	@Override
	public void execute() {
		// opération
		int resultat = op1().valeur() + op2().valeur();
		
		// stockage du resultat dans l'opérande 2
		stocker(resultat);
	}

}

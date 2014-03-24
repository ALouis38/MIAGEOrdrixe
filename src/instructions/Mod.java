package instructions;

public class Mod extends Instruction {
	
	/**
	 * Constructeur d'une instruction avec deux op�randes
	 * @param op1
	 * @param op2
	 */
	public Mod(Operande op1, Operande op2) {
		super(op1, op2);
	}
	
	/**
	 * Constructeur d'une instruction avec etiquette et deux op�randes
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Mod(Etiquette etiquette, Operande op1, Operande op2) {
		super(etiquette, op1, op2);
	}

	@Override
	public void execute() {
		// op�ration
		int resultat = op1().valeur() % op2().valeur();

		// stockage du resultat dans l'op�rande 2
		stocker(resultat);
	}

}
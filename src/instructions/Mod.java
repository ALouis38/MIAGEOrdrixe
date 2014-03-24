package instructions;

public class Mod extends Instruction {

	@Override
	void execute() {
		// opération
		int resultat = op1().valeur() % op2().valeur();

		// stockage du resultat dans l'opérande 2
		stocker(resultat);
	}

}

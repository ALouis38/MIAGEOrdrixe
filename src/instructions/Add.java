package instructions;

public class Add extends Instruction {

	@Override
	void execute() {
		// op�ration
		int resultat = op1().valeur() + op2().valeur();
		
		// stockage du resultat dans l'op�rande 2
		stocker(resultat);
	}

}

package instructions;

public class Add extends Instruction {

	@Override
	void execute() {
		// op�ration
		int resultat = op1().valeur() + op2().valeur();
		
		// TODO placement en m�moire
	}

}

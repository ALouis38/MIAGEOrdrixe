package instructions;

public class Mul extends Instruction {

	@Override
	void execute() {
		// op�ration
		int resultat = op1().valeur() * op2().valeur();
		
		// TODO placement en m�moire
	}

}

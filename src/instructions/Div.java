package instructions;

public class Div extends Instruction {

	@Override
	void execute() {
		// opération
		int resultat = op1().valeur() / op2().valeur();
		
		// TODO placement en mémoire
	}

}

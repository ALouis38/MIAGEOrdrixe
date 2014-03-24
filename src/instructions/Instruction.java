package instructions;

abstract class Instruction {
	
	private Etiquette etiquette;
	private Operande op1;
	private Operande op2;
	
	/**
	 * exectution de l'instruction (ex : ADD, MOV, etc)
	 */
	abstract void execute();
	
}

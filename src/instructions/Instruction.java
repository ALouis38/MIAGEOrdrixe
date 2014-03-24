package instructions;

abstract class Instruction {
	
	private Etiquette etiquette;
	private Operande op1;
	private Operande op2;
	
	abstract void execute();
	
}

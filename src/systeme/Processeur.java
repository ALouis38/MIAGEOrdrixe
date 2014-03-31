package systeme;

import instructions.operations.*;


public class Processeur {

	Memoire memoire;
	Instruction registreInstruction;
	int compteurOrdinal;
		
	public Processeur(Memoire memoire){
		this.memoire = memoire;
		compteurOrdinal = 0;
		registreInstruction = memoire.instruction(compteurOrdinal);
	}
	/**
	 * 
	 * @return la prochaine adresse à exécuter pour ce processus, -1 si mort
	 */
	public int execute(){
		if (registreInstruction instanceof Add) {
			executeAdd();
		} else if (registreInstruction instanceof Sub) {
			executeSub();
		} else if (registreInstruction instanceof Mul) {
			executeMul();
		} else if (registreInstruction instanceof Div) {
			executeDiv();
		} else if (registreInstruction instanceof Mod) {
			executeMod();
		} else if (registreInstruction instanceof Dat) {
			executeDat();
		} else if (registreInstruction instanceof Jmp) {
			executeJmp();
		} else if (registreInstruction instanceof Jmn) {
			executeJmn();
		} else if (registreInstruction instanceof Jmz) {
			executeJmz();
		} else if (registreInstruction instanceof Djn) {
			executeDjn();
		} else if (registreInstruction instanceof Cmp) {
			executeCmp();
		} else if (registreInstruction instanceof Slt) {
			executeSlt();
		}
		return compteurOrdinal;
	}
	
	public void chargerInstruction(){
		compteurOrdinal++;
		registreInstruction = memoire.instruction(compteurOrdinal);
	}
	
	/**
	 * Execution de l'addition
	 */
	private void executeAdd() {
		registreInstruction.op2().valeur(registreInstruction.op1().valeur() + registreInstruction.op2().valeur());
		compteurOrdinal++;
	}
	
	/**
	 * Execution de la soustraction
	 */
	private void executeSub() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() - registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	/**
	 * Multiplication
	 */
	private void executeMul() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() * registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	/**
	 * Division
	 */
	private void executeDiv() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() / registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	/**
	 * Modulo
	 */
	private void executeMod() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() / registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	/**
	 * DAT
	 */
	private void executeDat() {
		compteurOrdinal = -1;
	}
	
	/**
	 * Branchement JMP
	 */
	private void executeJmp() {
		compteurOrdinal = registreInstruction.op2().valeur();
	}
	
	/**
	 * Branchement JMZ
	 */
	private void executeJmz() {
		if(registreInstruction.op2().valeur() == 0)
			compteurOrdinal = registreInstruction.op1().valeur();
		else
			compteurOrdinal++;
	}
	
	/**
	 * Branchement JMN
	 */
	private void executeJmn() {
		if(registreInstruction.op2().valeur() != 0)
			compteurOrdinal = registreInstruction.op1().valeur();
		else
			compteurOrdinal++;
	}
	
	/**
	 * Branchement DJN
	 */
	private void executeDjn() {
		if(registreInstruction.op2().valeur() -1 == 0)
			compteurOrdinal = registreInstruction.op1().valeur();
		else
			compteurOrdinal++;
	}
	
	/**
	 * Branchement CMP
	 */
	private void executeCmp() {
		if(registreInstruction.op2().valeur() == registreInstruction.op1().valeur())
			compteurOrdinal++;
		else
			compteurOrdinal = compteurOrdinal + 2;
	}
	
	/**
	 * Branchement SLT
	 */
	private void executeSlt() {
		if(registreInstruction.op2().valeur() != registreInstruction.op1().valeur())
			compteurOrdinal++;
		else
			compteurOrdinal = compteurOrdinal + 2;
	}
}

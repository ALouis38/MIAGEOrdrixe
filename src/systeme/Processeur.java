package systeme;

import instructions.operations.Branchement;
import instructions.operations.Instruction;

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
//		if (registreInstruction instanceof Branchement) {
//			compteurOrdinal = ((Branchement) registreInstruction).executeBr();
//			if (compteurOrdinal == -1) {
//				compteurOrdinal++;
//			} else if (compteurOrdinal == -2){
//				compteurOrdinal = compteurOrdinal +2;
//			}
//		} else {
//			if (registreInstruction.execute()) {
//				memoire.instruction(compteurOrdinal, registreInstruction);
//				compteurOrdinal++;
//			} else {
//				compteurOrdinal = -1;
//			}	
//		}
//		return compteurOrdinal;
		
	}
	
	public void chargerInstruction(){
		compteurOrdinal++;
		registreInstruction = memoire.instruction(compteurOrdinal);
	}
	
	private void executeAdd() {
		registreInstruction.op2().valeur(registreInstruction.op1().valeur() + registreInstruction.op2().valeur());
		compteurOrdinal++;
	}
	
	private void executeSub() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() - registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	private void executeMul() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() * registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	private void executeDiv() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() / registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	private void executeMod() {
		registreInstruction.op2().valeur(registreInstruction.op2().valeur() / registreInstruction.op1().valeur());
		compteurOrdinal++;
	}
	
	private void executeDat() {
		compteurOrdinal = -1;
	}
	
	private void executeJmp() {
		compteurOrdinal = registreInstruction.op2().valeur();
	}
	
	private void executeJmz() {
		if(registreInstruction.op2().valeur() == 0)
			compteurOrdinal = registreInstruction.op1().valeur();
		else
			compteurOrdinal++;
	}
	
	private void executeJmn() {
		if(registreInstruction.op2().valeur() != 0)
			compteurOrdinal = registreInstruction.op1().valeur();
		else
			compteurOrdinal++;
	}
	
	private void executeDjn() {
		if(registreInstruction.op2().valeur() -1 == 0)
			compteurOrdinal = registreInstruction.op1().valeur();
		else
			compteurOrdinal++;
	}
	
	private void executeCmp() {
		if(registreInstruction.op2().valeur() == registreInstruction.op1().valeur())
			compteurOrdinal++;
		else
			compteurOrdinal = compteurOrdinal + 2;
	}
	
	private void executeSlt() {
		if(registreInstruction.op2().valeur() != registreInstruction.op1().valeur())
			compteurOrdinal++;
		else
			compteurOrdinal = compteurOrdinal + 2;
	}
}

package systeme;

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
	
	public void execute(){
		registreInstruction.execute();
	}
	
	public void chargerInstruction(){
		compteurOrdinal++;
		registreInstruction = memoire.instruction(compteurOrdinal);
	}
}

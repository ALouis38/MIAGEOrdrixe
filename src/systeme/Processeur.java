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
	/**
	 * 
	 * @return la prochaine adresse à exécuter pour ce processus, -1 si mort
	 */
	public int execute(){
		if (registreInstruction instanceof Branchement) {
			compteurOrdinal = registreInstruction.execute();
		} else {
			if (registreInstruction.execute()) {
				memoire.instruction(compteurOrdinal, registreInstruction);
				compteurOrdinal++;
			} else {
				compteurOrdinal = -1;
			}	
		}
		return compteurOrdinal;
	}
	
	public void chargerInstruction(){
		compteurOrdinal++;
		registreInstruction = memoire.instruction(compteurOrdinal);
	}
}

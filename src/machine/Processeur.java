package machine;

import systeme.Processus;
import instructions.Operande;
import instructions.operations.*;

public class Processeur {

	Memoire memoire;
	Instruction registreInstruction;
	protected int compteurOrdinal;
	int e1, e2; // les adresses effeectives

	public Processeur(Memoire memoire) {
		this.memoire = memoire;
		compteurOrdinal = 0;
		registreInstruction = memoire.instruction(compteurOrdinal);
	}
	
	/**
	 * execute l'instruction stockée en mémoire à l'adresse courante
	 * @param adresseCourante
	 */
	public void execute(int adresseCourante){
		
	}
	

	public abstract class Instruct {
		public void execute() {
			registreInstruction = memoire.instruction(compteurOrdinal);
			e1 = adresseEffective(registreInstruction.op1());
			e2 = adresseEffective(registreInstruction.op2());
			compteurOrdinal++;
			operer();
		}

		protected abstract void operer();

		protected Memoire memoire() {
			return memoire;
		}

		protected int e1() {
			return e1;
		}

		protected int e2() {
			return e2;
		}
		
		protected int compteurOrdinal(){
			return compteurOrdinal;
		}
		
		protected void compteurOrdinal(int pc){
			compteurOrdinal = pc;
		}
		
		protected Instruction registreInstruction(){
			return registreInstruction;
		}
	}


	/**
	 * retourne l'adresse effective de l'opérande selon son type d'adressage
	 * 
	 * @param op
	 * @return
	 */
	private int adresseEffective(Operande op) {
		// adressage relatif
		if (op.adressage().symbole().equals("$")
				|| op.adressage().symbole().equals(""))
			return compteurOrdinal + op.valeur();
		// adressage immediat
		else if (op.adressage().symbole().equals("#")) {
			return compteurOrdinal;
		}
		// adressage relatif indirect
		else if (op.adressage().symbole().equals("@")) {
			return compteurOrdinal
					+ memoire.instruction(compteurOrdinal + op.valeur()).op2()
							.valeur();
		}
		return 0;
	}
}
package instructions;

public abstract class Instruction {
	
	protected Etiquette etiquette;
	protected Operande op1;
	protected Operande op2;
	
	/**
	 * exectution de l'instruction (ex : ADD, MOV, etc)
	 */
	abstract void execute();

	/**
	 * accesseur d'etiquette
	 * @return
	 */
	public Etiquette etiquette() {
		return etiquette;
	}

	/**
	 * modificateur d'etiquette
	 * @param etiquette
	 */
	public void etiquette(Etiquette etiquette) {
		this.etiquette = etiquette;
	}

	/**
	 * accesseur opérande 1
	 * @return
	 */
	public Operande op1() {
		return op1;
	}

	/**
	 * modificateur d'opérande 1
	 * @param etiquette
	 */
	public void op1(Operande op1) {
		this.op1 = op1;
	}

	/**
	 * accesseur opérande 2
	 * @return
	 */
	public Operande op2() {
		return op2;
	}

	/**
	 * modificateur d'opérande 2
	 * @param etiquette
	 */
	public void op2(Operande op2) {
		this.op2 = op2;
	}
	
	/**
	 * stocke en mémoire le résultat de l'opération
	 * @param resultat
	 */
	protected void stocker(int resultat){
		op2().valeur(resultat);
	}
	
	
	
}

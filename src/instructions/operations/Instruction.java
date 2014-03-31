package instructions.operations;

import instructions.Etiquette;
import instructions.Operande;

public abstract class Instruction {
	
	protected Etiquette etiquette;
	protected Operande op1;
	protected Operande op2;
	protected int adresse = 0;

	/**
	 * Constructeur d'une instruction avec etiquette et deux opérandes
	 * @param etiquette
	 * @param op1
	 * @param op2
	 */
	public Instruction(Etiquette etiquette, Operande op1, Operande op2){
		this.etiquette = etiquette;
		this.op1 = op1;
		this.op2 = op2;
	}
	
	/**
	 * Constructeur d'une instruction avec etiquette et une opérande 
	 * @param etiquette
	 * @param op2
	 */
	public Instruction(Etiquette etiquette, Operande op2){
		this.etiquette = etiquette;
		this.op2 = op2;
	}
	
	/**
	 * Constructeur d'une instruction avec deux opérandes
	 * @param op1
	 * @param op2
	 */
	public Instruction(Operande op1, Operande op2){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	/**
	 * Constructeur d'une instruction avec une opérande
	 * @param op2
	 */
	public Instruction(Operande op2){
		this.op2 = op2;
	}
	
	/**
	 * exectution de l'instruction (ex : ADD, MOV, etc)
	 */
	public abstract int execute();

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
	 * accesseur d'adresse
	 * @return
	 */
	public int adresse(){
		return this.adresse;
	}
	
	/**
	 * mutateur d'adresse
	 * @param adresse
	 */
	public void adresse(int adresse){
		this.adresse = adresse();
	}
	
	/**
	 * stocke en mémoire le résultat de l'opération
	 * @param resultat
	 */
	protected void stocker(int resultat){
		op2().valeur(resultat);
	}
	
	
	
}

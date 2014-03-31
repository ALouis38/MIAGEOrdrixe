package instructions.operations;

import java.io.Serializable;

import instructions.Etiquette;
import instructions.Operande;

public abstract class Instruction implements Serializable {
	
	protected Etiquette etiquette;
	protected Operande op1;
	protected Operande op2;
	protected int adresse = 0;

	/**
	 * Constructeur d'une instruction avec etiquette et deux op�randes
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
	 * Constructeur d'une instruction avec etiquette et une op�rande 
	 * @param etiquette
	 * @param op2
	 */
	public Instruction(Etiquette etiquette, Operande op2){
		this.etiquette = etiquette;
		this.op2 = op2;
	}
	
	/**
	 * Constructeur d'une instruction avec deux op�randes
	 * @param op1
	 * @param op2
	 */
	public Instruction(Operande op1, Operande op2){
		this.op1 = op1;
		this.op2 = op2;
	}
	
	/**
	 * Constructeur d'une instruction avec une op�rande
	 * @param op2
	 */
	public Instruction(Operande op2){
		this.op2 = op2;
	}
	
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
	 * accesseur op�rande 1
	 * @return
	 */
	public Operande op1() {
		return op1;
	}

	/**
	 * modificateur d'op�rande 1
	 * @param etiquette
	 */
	public void op1(Operande op1) {
		this.op1 = op1;
	}

	/**
	 * accesseur op�rande 2
	 * @return
	 */
	public Operande op2() {
		return op2;
	}

	/**
	 * modificateur d'op�rande 2
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
	 * stocke en m�moire le r�sultat de l'op�ration
	 * @param resultat
	 */
	protected void stocker(int resultat){
		op2().valeur(resultat);
	}
	
}

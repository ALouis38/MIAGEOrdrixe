package instructions;

import java.io.Serializable;

import instructions.adressages.Adressage;

public class Operande implements Serializable {
	
	private Adressage typeAdr;
	
	private int valeur;
	
	/**
	 * Constructeur d'op�rande
	 * @param typeAdr
	 * @param valeur
	 */
	public Operande(Adressage typeAdr, int valeur){
		this.typeAdr = typeAdr;
		this.valeur = valeur;
	}
	
	/**
	 * TODO Retourne la valeur selon le type d'adressage
	 * @return valeur
	 */
	public int valeur(){
		return this.valeur;
	}
	
	/**
	 * Setter de valeur
	 * @param valeur � affecter
	 */
	public void valeur(int valeur){
		this.valeur = valeur;
	}
	
	
	/**
	 * TODO Retourne la valeur selon le type d'adressage
	 * @return valeur
	 */
	public Adressage adressage(){
		return this.typeAdr;
	}
	
	/**
	 * Setter de valeur
	 * @param valeur � affecter
	 */
	public void adressage(Adressage typeAdr){
		this.typeAdr = typeAdr;
	}
	
}

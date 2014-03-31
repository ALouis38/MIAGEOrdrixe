package instructions.adressages;

import java.io.Serializable;

public abstract class Adressage implements Serializable  {
	protected String symbole;
	/**
	 * Setter
	 * @param symbole Le symbole de l'adressage
	 */
	public void symbole(String symbole){
		this.symbole = symbole;
	}
	/**
	 * Getter
	 * @return la repr�sentation du symbole de l'adressage
	 */
	public String symbole(){
		return this.symbole;
	}
}

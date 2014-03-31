package instructions.adressages;

public abstract class Adressage {
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

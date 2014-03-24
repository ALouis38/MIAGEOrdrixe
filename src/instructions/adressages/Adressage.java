package instructions.adressages;

public abstract class Adressage {
	protected String symbole;
	/**
	 * Setter
	 * @param symbole Le symbole de l'adressage
	 */
	protected void symbole(String symbole){
		this.symbole = symbole;
	}
	/**
	 * Getter
	 * @return la représentation du symbole de l'adressage
	 */
	protected String symbole(){
		return this.symbole;
	}
}

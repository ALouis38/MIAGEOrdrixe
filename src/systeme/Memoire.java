package systeme;
import instructions.*;
import instructions.operations.Instruction;

public class Memoire {
	
	private Instruction [] contenu;
	
	/**
	 * constructeur de m�moire
	 * @param taille
	 */
	public Memoire(int taille){
		this.contenu = new Instruction[32];
	}
	
	/**
	 * accesseur du contenu de la m�moire
	 * @return contenu
	 */
	public Instruction[] contenu(){
		return this.contenu;
	}
	
	/**
	 * accesseur d'une intruction de la m�moire
	 * @param compteurOrdinal
	 * @return instruction
	 */
	public Instruction instruction(int compteurOrdinal){
		return contenu()[compteurOrdinal];
	}

	/**
	 * Ajout d'une instruction
	 * @param compteurOrdinal
	 * @param instruction
	 */
	public void instruction(int compteurOrdinal, Instruction instruction){
		contenu()[compteurOrdinal] = instruction;
	}
}

package machine;
import instructions.*;
import instructions.operations.Instruction;

public class Memoire {
	
	private Instruction [] contenu;
	
	/**
	 * constructeur de m�moire
	 * @param taille
	 */
	public Memoire(int taille){
		this.contenu = new Instruction[(int) Math.pow(2, taille)];
	}
	
	/**
	 * accesseur d'une intruction de la mémoire
	 * @param compteurOrdinal
	 * @return instruction
	 */
	public Instruction instruction(int compteurOrdinal){
		return contenu[compteurOrdinal];
	}
	
	public int tailleMemoire(){
		return contenu.length;
	}
	
	public Instruction [] contenu(){
		return this.contenu;
	}
	/**
	 * Ajout d'une instruction
	 * @param compteurOrdinal
	 * @param instruction
	 */
	public void instruction(int compteurOrdinal, Instruction instruction){
		/*Permet à un combattant de placer des instructions à des adresses excédants la taille de la mémoire
		 * (Choix de déveleoppement retenu)
		 * */
		if(compteurOrdinal>=contenu.length){
			compteurOrdinal = compteurOrdinal % contenu.length;
		}
		contenu[compteurOrdinal] = instruction;
	}
	
	public void afficheMemoire(){
		for(int i=0;i<contenu.length;i++){
			System.out.println(i + " : " + contenu[i]);
		}
	}
	
}
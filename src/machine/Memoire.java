package machine;
import instructions.*;
import instructions.operations.Instruction;

public class Memoire {
	
	private Instruction [] contenu;
	private int puissance;
	
	/**
	 * constructeur de m�moire
	 * @param taille
	 */
	public Memoire(int puissance){
		this.puissance = puissance;
		this.contenu = new Instruction[(int) Math.pow(2, puissance)];
	}
	
	/**
	 * accesseur d'une intruction de la mémoire
	 * @param compteurOrdinal
	 * @return instruction
	 */
	public Instruction instruction(int compteurOrdinal){
		if(compteurOrdinal>=contenu.length){
			compteurOrdinal = compteurOrdinal % contenu.length;
		}
		return contenu[compteurOrdinal];
	}
	
	public int tailleMemoire(){
		return contenu.length;
	}
	
	public int puissance(){
		return this.puissance;
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
package systeme;

import instructions.Operande;
import instructions.adressages.Relatif;
import instructions.operations.Instruction;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import machine.Memoire;

public class Chargeur {
	private Memoire memSysteme;
	private int taille;
	/**
	 * Constructeur
	 * @param taille de la mémoire
	 */
	public Chargeur(int taille){
		Memoire memSysteme = new Memoire(taille);
		System.out.println(memSysteme);
		this.taille = (int) Math.pow(2, taille);
		System.out.println(this.taille);
	
		//Initialisation de la m�moire
		for(int i =1; i <= 256; i++){
			System.out.println(i);
				memSysteme().instruction(i, new instructions.operations.Dat(new Operande(new Relatif(),0)));
		}
	}
	
	public void remplirMemoire(){
		List<Instruction> contenuAL = restaure();
		int lower = 0;
		int higher = (int) Math.pow(2, this.taille);
		int random = (int)(Math.random() * (higher-lower)) + lower;
			
		
		/*Remplissage al�atoire et sans chevauchement de la mémoire*/
		for(Instruction object: contenuAL){			
			while(!(memSysteme().instruction(random) instanceof instructions.operations.Dat)){
				 random = random+1;
			}
			memSysteme().instruction(random,object);
		}
		memSysteme().afficheMemoire();

	}
	
	/**
	 * Désérialisation des instructions des combattants
	 * @return la liste des Instruction fournie par la désérialisation
	 */
	public static List<Instruction> restaure() {
		try {
			FileInputStream fichier = new FileInputStream("sauvegarde.ordx");
			ObjectInputStream in = new ObjectInputStream(fichier);
			return ((List<Instruction>) in.readObject());
		} catch (Exception e) {
			String dialog = "Pbs de Restauration ou fichier non encore créé";
			System.out.println(dialog);
			return null;
		}
	}
	
	public Memoire memSysteme(){
		return this.memSysteme;
	}
	
	public void memSysteme(Memoire memSysteme){
		this.memSysteme = memSysteme;
	}
}
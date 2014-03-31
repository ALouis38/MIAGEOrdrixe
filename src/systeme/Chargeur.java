package systeme;

import instructions.operations.Instruction;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.util.List;

public class Chargeur {
	
	private Memoire memSysteme;
	
	/**
	 * Constructeur
	 * @param taille de la mémoire
	 */
	public Chargeur(int taille){
		Memoire memSysteme = new Memoire(taille);
		List<Instruction> contenuAL = restaure();
		int lower = 0;
		int higher = taille;
		int random = (int)(Math.random() * (higher-lower)) + lower;
		/*Remplissage aléatoire et sans chevauchement de la mémoire*/
		for(Instruction object: contenuAL){			
			while(memSysteme.instruction(random)!= null){
				 random = (int)(Math.random() * (higher-lower)) + lower;
			}
			memSysteme.instruction(random,object);
		}
		memSysteme.afficheMemoire();
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
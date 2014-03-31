package tests;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import systeme.Chargeur;
import instructions.*;
import instructions.adressages.Immediat;
import instructions.operations.Add;
import instructions.operations.Div;
import instructions.operations.Instruction;
import grammaire.Compiler;
import instructions.operations.Mod;
import instructions.operations.Mul;
import instructions.operations.Sub;

public class testInstructions {

	public static void main(String[] args) throws Exception {
		
		Chargeur ch = new Chargeur(5);
		
	/*sauve();
	List<Instruction> list1 = restaure();
	for(int i=0; i<list1.size(); i++){
		System.out.println("op1 | adressage : "+list1.get(i).op1().adressage().symbole()+", valeur : "+list1.get(i).op1().valeur());
		System.out.println("op2 | adressage : "+list1.get(i).op2().adressage().symbole()+", valeur : "+list1.get(i).op2().valeur());
		System.out.println("type adressage op1 : "+list1.get(i).op1().adressage().getClass());
		System.out.println("type adressage op2 : "+list1.get(i).op2().adressage().getClass());
	}*/
		
	 /*= Compiler.compile("Z:/git/MIAGEOrdrixe/src/tests/test");
	System.out.println("Taille de la liste d'instruction : " + list1.size());
	for(int i=0; i<list1.size(); i++){
		System.out.println("op1 | adressage : "+list1.get(i).op1().adressage().symbole()+", valeur : "+list1.get(i).op1().valeur());
		System.out.println("op2 | adressage : "+list1.get(i).op2().adressage().symbole()+", valeur : "+list1.get(i).op2().valeur());
		System.out.println("type adressage op1 : "+list1.get(i).op1().adressage().getClass());
		System.out.println("type adressage op2 : "+list1.get(i).op2().adressage().getClass());
	}
		
		// instanciation des opérandes
		Operande op1 = new Operande(new Immediat(), 4);
		//System.out.println(op1.valeur());
		Operande op2 = new Operande(new Immediat(), 2);
		//System.out.println(op2.valeur());
		
		// instanciation des inst 
		Add addInst = new Add(op1, op2);
		Sub subInst = new Sub(op1, op2);
		Mul mulInst = new Mul(op1, op2);
		Div divInst = new Div(op1, op2);
		Mod modInst = new Mod(op1, op2);
		
		// test des execute (n'en executer qu'un seul à la fois)
		
		addInst.execute();
//		subInst.execute();
//		mulInst.execute();
//		divInst.execute();
//		modInst.execute();

		// debug du resultat
		//System.out.println(op2.valeur());*/
		

	}
	
	/** Ici pour test, présente dans Chargeur
	 * Restaure la liste des instructions
	 * @return
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

    /** TODO mettre dans le compilateur (= compiler ou controleur?)
     * sauvegarde de la liste d'instruction
     */
    private static void sauve() {
        try {
            FileOutputStream f = new FileOutputStream("sauvegarde.ordx");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(Compiler.compile("Z:/git/MIAGEOrdrixe/src/tests/test.ord"));
        } catch (Exception e) {
        	System.out.println(e);
            String dialog = "Pb de Sauvegarde dans le fichier";
            System.out.println(dialog);
        }
    }

}
package tests;

import instructions.*;
import instructions.adressages.Immediat;
import instructions.operations.Add;
import instructions.operations.Div;
import instructions.operations.Mod;
import instructions.operations.Mul;
import instructions.operations.Sub;

public class testInstructions {

	public static void main(String[] args) {
		
		// instanciation des opérandes
		Operande op1 = new Operande(new Immediat(), 4);
		System.out.println(op1.valeur());
		Operande op2 = new Operande(new Immediat(), 2);
		System.out.println(op2.valeur());
		
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
		System.out.println(op2.valeur());
	}

}

import systeme.*;


public class Controleur {

	public static void main(String[] args) {
		new Controleur();

	}
	
	public Controleur(){
		new Compilateur("Z:/git/MIAGEOrdrixe/src/tests/test.ord");
		new Compilateur("Z:/git/MIAGEOrdrixe/src/tests/test2.ord");
		Chargeur c = new Chargeur(8);
		c.remplirMemoire();
		//Systeme s = new Systeme();
	}

}

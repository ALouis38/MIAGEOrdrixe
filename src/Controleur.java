import systeme.*;


public class Controleur {

	public static void main(String[] args) {
		new Controleur();

	}
	
	public Controleur(){
		Chargeur c = new Chargeur(5);
		new Compilateur("/home/c/cutroneg/git/MIAGEOrdrixe/src/tests/test.ord");
		c.remplirMemoire();
		new Compilateur("/home/c/cutroneg/git/MIAGEOrdrixe/src/tests/test2.ord");
		c.remplirMemoire();
		c.memSysteme().afficheMemoire();
		
		
		//Systeme s = new Systeme();
	}

}

import systeme.*;


public class Controleur {

	public static void main(String[] args) {
		new Controleur();

	}
	
	public Controleur(){
		Processus [] tabProcessus = new Processus[2];
		
		Chargeur c = new Chargeur(5);
		
		new Compilateur("/home/c/cutroneg/git/MIAGEOrdrixe/src/tests/test.ord");
		Processus p1 =  new Processus(1, c.remplirMemoire());
		tabProcessus[0] = p1;
		
		new Compilateur("/home/a/amorel/git/MIAGEOrdrixe/src/tests/perdant.ord");
		Processus p2 =  new Processus(2, c.remplirMemoire());
		tabProcessus[1] = p2;
		
		
		c.memSysteme().afficheMemoire();
		Systeme s = new Systeme(c.memSysteme(), tabProcessus);
		s.jeu();
	}

}

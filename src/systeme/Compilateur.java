package systeme;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import grammaire.Compiler;

public class Compilateur {
	public Compilateur(String filePath){
		this.sauve(filePath);
	}
		
    private static void sauve(String filePath) {
        try {
            FileOutputStream f = new FileOutputStream("sauvegarde.ordx");
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(Compiler.compile("Z:/git/MIAGEOrdrixe/src/tests/test.ord"/*filePath*/));
        } catch (Exception e) {
        	System.out.println(e);
            String dialog = "Pb de Sauvegarde dans le fichier";
            System.out.println(dialog);
        }
    }
}

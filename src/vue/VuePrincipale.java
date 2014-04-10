package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.TableModel;

import machine.Memoire;
import systeme.Chargeur;
import systeme.Compilateur;
import systeme.Processus;
import systeme.Systeme;

public class VuePrincipale extends JFrame {
	private JTable table;

	/**
	 * fake d'un controlleur pour tester la vue
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		Processus[] tabProcessus = new Processus[2];

		Chargeur c = new Chargeur(5);

		new Compilateur("/home/c/cutroneg/git/MIAGEOrdrixe/src/tests/test.ord");
		Processus p1 = new Processus(1, c.remplirMemoire());
		tabProcessus[0] = p1;

		new Compilateur("/home/c/cutroneg/git/MIAGEOrdrixe/src/tests/test2.ord");
		Processus p2 = new Processus(2, c.remplirMemoire());
		tabProcessus[1] = p2;

		c.memSysteme().afficheMemoire();
		Systeme s = new Systeme(c.memSysteme(), tabProcessus);
		s.jeu();

		new VuePrincipale(c.memSysteme());
	}

	public VuePrincipale(Memoire m) {
		this.setSize(640, 220);
		getContentPane().setLayout(null);
		
		int tailleMem = m.tailleMemoire();
		int nbL, nbC;
		
		
		

		String[] columnNames = { "1", "2", "3", "4"};

		Object[][] data = new Object[8][4];
		int compteur = 1;
		
		// remplissage de data avec le contenu de la mémoire
		for(int i=0; i<8; i++){
			for(int j=0; j<4; j++){
				if(m.instruction(compteur).getClass().getName().equals("instructions.operations.Dat")){
					data[i][j] = "DAT";
				}
				compteur++;
			}
		}
		
		table = new JTable(data, columnNames);
		table.setBounds(0, 0, 620, 200);

		getContentPane().add(table);

		this.initialize();
	}

	public void initialize() {
		this.setVisible(true);
		// http://www.roseindia.net/java/example/java/swing/GetRowsAndCols.shtml
	}
}

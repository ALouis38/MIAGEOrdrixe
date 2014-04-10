package vue;

import instructions.operations.Instruction;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import machine.Memoire;
import systeme.Chargeur;
import systeme.Compilateur;
import systeme.Processus;
import systeme.Systeme;

public class VuePrincipale extends JFrame {
	private JTable table;

	public VuePrincipale(Memoire m) {
		this.setSize(640, 100);
		getContentPane().setLayout(null);

		// récupération de la taille de la mémoire
		int tailleMem = m.puissance();
		int nbL, nbC;

		// conversion en tableau a 2 dimensions
		nbL = (int) Math.pow(2, tailleMem / 2);
		nbC = (int) Math.pow(2, tailleMem - tailleMem / 2);

		String[] columnNames = new String[nbC];
		for (int i = 0; i < nbC; i++) {
			columnNames[i] = String.valueOf(i);
		}

		Object[][] data = new Object[nbL][nbC];
		int compteur = 1;

		// remplissage de data avec le contenu de la mémoire
		for (int i = 0; i < nbL; i++) {
			for (int j = 0; j < nbC; j++) {
				Instruction inst = m.instruction(compteur);
				String nomInst = inst.getClass().getName();
				nomInst = " "+nomInst.replace("instructions.operations.", "") + " ";
				
				data[i][j] = ajoutOperandes(nomInst, inst);
				compteur++;
			}
		}

		table = new JTable(data, columnNames);
		table.setBounds(0, 0, 620, 100);

		getContentPane().add(table);

		this.initialize();
	}
	
	/**
	 * ajoute les opérandes au string qui sera affiché dans la cellule du jtable
	 * @param nomInst
	 * @param inst
	 * @return
	 */
	public String ajoutOperandes(String nomInst, Instruction inst){
		String symbole;
		
		if(inst.op1() != null){
			if(inst.op1().adressage() != null)
				symbole = inst.op1().adressage().symbole();
			else
				symbole = "";
			nomInst+=symbole+String.valueOf(inst.op1().valeur());
		}
		if(inst.op2() != null){
			if(inst.op2().adressage() != null)
				symbole = inst.op2().adressage().symbole();
			else
				symbole = "";
			nomInst+=symbole+String.valueOf(inst.op2().valeur());
		}
		
		return nomInst;
	}

	public void initialize() {
		this.setVisible(true);
		// http://www.roseindia.net/java/example/java/swing/GetRowsAndCols.shtml
	}
}

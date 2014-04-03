package vue;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VuePrincipale extends JFrame {
	
	public static void main(String[] args) throws Exception {
		new VuePrincipale();
	}
	
	public VuePrincipale(){
		this.initialize();
	}
	
	
	
	public void initialize(){
		
		//Main Frame
		setResizable(false);
		setTitle("Ordrixe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(1375, 582));
		setLocationRelativeTo(null);
		setVisible(true);
		
		//Menu		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmNouveauJeu = new JMenuItem("Nouveau jeu");
		mntmNouveauJeu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
			}
		});
		mnFichier.add(mntmNouveauJeu);
		JSeparator separator = new JSeparator();
		mnFichier.add(separator);
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (JOptionPane.showConfirmDialog(null, "Souhaitez-vous quitter l'application?", "Quitter", JOptionPane.OK_CANCEL_OPTION) == 0) dispose();
			}
		});
		mnFichier.add(mntmQuitter);
		
		
	}
}

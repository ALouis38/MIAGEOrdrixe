package vue;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VueSelection extends JFrame {
	
	private JFrame frameSelection;
	private JScrollPane scrollPaneCombattants;
	private JList listCombattants;
	private DefaultListModel modelListeCombattants;
	
	public static void main(String[] args) throws Exception {
		new VueSelection();
	}
	
	public VueSelection(){
		this.initialize();
	}
	
	
	
	public void initialize(){
		
		//Main Frame
		frameSelection = new JFrame();
		
		frameSelection.setTitle("Ordrixe - Séléction combattant");
		frameSelection.setBounds(100, 100, 708, 632);
		frameSelection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSelection.getContentPane().setLayout(null);
		
		//frameSelection.setMinimumSize(new Dimension(400, 400));
		//frameSelection.setLocationRelativeTo(null);
		
		frameSelection.setVisible(true);
		frameSelection.setResizable(false);
		//Appel au controleur
		
		//Menu		
		JMenuBar menuBar = new JMenuBar();
		frameSelection.setJMenuBar(menuBar);
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				if (JOptionPane.showConfirmDialog(null, "Souhaitez-vous quitter l'application?", "Quitter", JOptionPane.OK_CANCEL_OPTION) == 0) dispose();
			}
		});
		mnFichier.add(mntmQuitter);
		frameSelection.getContentPane().add(mnFichier);
		//Listing fichier
		
		
	}
}

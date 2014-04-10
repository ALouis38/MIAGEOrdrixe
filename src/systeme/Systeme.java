package systeme;

import machine.Memoire;
import machine.Processeur;

public class Systeme {

	Processeur processeur;
	Processus[] listeProcessus;
	int nbProcessusVivants;

	public Systeme(Memoire mem, Processus[] tabProcessus) {
		this.processeur = new Processeur(mem);
		this.listeProcessus = tabProcessus;
		this.nbProcessusVivants = tabProcessus.length;
	}

	public void jeu() {
		int i = 0;
		while (nbProcessusVivants > 1) {
			i = i % listeProcessus.length;
			if (listeProcessus[i].vivant()) {
				processeur.execute(listeProcessus[i]);
				if (listeProcessus[i].adresseCourante() == -1) {
					listeProcessus[i].mourir();
					nbProcessusVivants--;
				}
			}
			i++;
		}
//		System.out.println("le processus n°"+(i-1)%+listeProcessus.length+" a gagné");
	}
}

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
				listeProcessus[i].adresseSuivante(processeur.execute(listeProcessus[i]));
//				System.out.println("PC RETOURNE : "+processeur.execute(listeProcessus[i]));
				System.out.println("Adresse courante :"+listeProcessus[i].adresseCourante());
				if (listeProcessus[i].adresseCourante() == -1) {
					listeProcessus[i].mourir();
					nbProcessusVivants--;
				}
			}
			i++;
		}
		System.out.println("le processus n°"+listeProcessus[i].numero()+" a gagné");
	}
}

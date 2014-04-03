package systeme;

import machine.Memoire;
import machine.Processeur;

public class Systeme {
	
	Memoire memoire;
	Processeur processeur;
	Processus [] listeProcessus;
	int nbProcessusVivants;
	
	public Systeme(){
		nbProcessusVivants = listeProcessus.length;
		int i = 0;
		
		while(nbProcessusVivants > 0){
			i = i % listeProcessus.length;
				if (listeProcessus[i].vivant()) {
					processeur.execute(listeProcessus[i].adresseCourrante());
					if (listeProcessus[i].adresseCourrante() == -1) {
						listeProcessus[i].mourir();
						nbProcessusVivants--;
					}
				}
			i++;
		}
	}
}

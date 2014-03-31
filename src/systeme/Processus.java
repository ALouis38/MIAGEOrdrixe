package systeme;

public class Processus {
	
	int numero;
	int adresseCourrante;
	boolean vivant;
	
	/**
	 * Constructeur d'un processus
	 * @param numero : numéro du processus
	 * @param adresse : adresse de la première instruction
	 */
	public Processus(int numero, int adresse){
		this.numero = numero;
		adresseCourrante = adresse;
		vivant = true;
	}
	
	/**
	 * Accéder au numero du processus
	 * @return numero du processus
	 */
	public int numero(){
		return numero;
	}
	
	/**
	 * Accéder à l'adresse de l'instruction à exécuter
	 * @return adresse de l'instruction à exécuter
	 */
	public int adresseCourrante(){
		return adresseCourrante;
	}
	
	/**
	 * Accéder à l'état du processus. 
	 * @return vrai si vivant, faux si mort
	 */
	public boolean vivant(){
		return vivant;
	}
	
	/**
	 * Fonction permettant de tuer le processus
	 */
	public void mourir(){
		vivant = false;
	}
	
	/**
	 * Fonction permettant de passer le pointeur à l'instruction suivante
	 */
	public void adresseSuivante(int adresse){
		adresseCourrante = adresse;
	}
}

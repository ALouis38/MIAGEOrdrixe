package instructions;

public class Operande {
	
	private String typeAdr;
	
	private int valeur;
	
	/**
	 * TODO Retourne la valeur selon le type d'adressage
	 * @return valeur
	 */
	public int valeur(){
		return this.valeur;
	}
	
	/**
	 * Setter de valeur
	 * @param valeur à affecter
	 */
	public void valeur(int valeur){
		this.valeur = valeur;
	}
	
}

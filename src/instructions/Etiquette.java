package instructions;

public class Etiquette {
	
	private String etiq;
	
	/**
	 * Constructeur d'�tiquette
	 * @param etiq
	 */
	public Etiquette(String etiq){
		this.etiq = etiq;
	}
	
	/**
	 * Setter d'�tiquette
	 * @param etiq
	 */
	public void etiq(String etiq){
		this.etiq = etiq;
	}
	
	/**
	 * Accesseur d'�tiquette
	 * @return
	 */
	public String etiq(){
		return this.etiq;
	}

}

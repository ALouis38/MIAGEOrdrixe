package instructions;

public class Etiquette {
	
	private String etiq;
	
	/**
	 * Constructeur d'étiquette
	 * @param etiq
	 */
	public Etiquette(String etiq){
		this.etiq = etiq;
	}
	
	/**
	 * Setter d'étiquette
	 * @param etiq
	 */
	public void etiq(String etiq){
		this.etiq = etiq;
	}
	
	/**
	 * Accesseur d'étiquette
	 * @return
	 */
	public String etiq(){
		return this.etiq;
	}

}

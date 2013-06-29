package enumeration;

public enum Veiculo {
	
	GOL ("Volks", "branca"),
	PALIO ("Fiat", "preta"),
	CORSA ("Chevrolet", "amarelo");
	
	private String marca;
	private String cor;
	
	Veiculo(String marca, String cor) {
		this.marca = marca;
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getMarca() {
		return marca;
	}
	

}

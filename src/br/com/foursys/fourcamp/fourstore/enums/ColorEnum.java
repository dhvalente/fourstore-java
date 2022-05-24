package br.com.foursys.fourcamp.fourstore.enums;

public enum ColorEnum {
	AMARELO(11 , "Amarelo"), 
	AZUL(22 , "Azul"), 
	BRANCO(33, "Branco"), 
	CINZA(44, "Cinza"), 
	LARANJA(55, "Laranja"), 
	MARROM(66 , "Marrom"), 
	PRETO(77, "Preto"), 
	ROXO(88 , "Roxo"), 
	VERDE(99 , "Verde"), 
	VERMELHO(10, "Vermelho");

	private int key;
	private String description;
	
	ColorEnum(int key, String description) {
		this.key = key;
		this.description = description;
	}
	
	public int getKey() {
		return key;
	}

	public String getDescription() {
		return description;
	}

}
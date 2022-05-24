package br.com.foursys.fourcamp.fourstore.enums;

public enum SizeEnum {
	PP(50 , "Tamanho PP"), 
	P(51 , " Tamanho P"), 
	M(52 , "Tamanho M"), 
	G(53, "Tamanho G"),
	GG(54, "Tamanho GG");

	
	private int key;
	private String description;
	
	SizeEnum(int key, String description) {
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
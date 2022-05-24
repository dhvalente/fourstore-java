package br.com.foursys.fourcamp.fourstore.enums;

public enum SeasonEnum {
	INVERNO(6090 , "Inverno"), 
	OUTONO(3060 , " Outono"), 
	VERAO(3030 , "Verão"), 
	PRIMAVERA(9012, "Primavera");
	
	private int key;
	private String description;
	
	SeasonEnum(int key, String description) {
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
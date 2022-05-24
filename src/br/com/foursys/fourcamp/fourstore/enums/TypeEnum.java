package br.com.foursys.fourcamp.fourstore.enums;

public enum TypeEnum {
	MANGALONGA(92, "Manga Longa"),
	MANGACURTA(93, "Manga Curta"),
	GOLAV(94, "Gola em V"),
	GOLAPOLO(95, "Gola Polo"),
	SKINNY(96, "Skinny");
	
	private int key;
	private String description;
	
	
	TypeEnum(int key, String description) {
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
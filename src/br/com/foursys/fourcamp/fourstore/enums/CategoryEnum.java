package br.com.foursys.fourcamp.fourstore.enums;

public enum CategoryEnum {
	
	ACESSORIOS(31, "Acessórios"), 
	BERMUDAS(32, "Bermudas"), 
	BLUSAS(33, "Blusas"), 
	CALCADOS(34, "Calçados"),
	CALCAS(35, "Calças"), 
	CAMISETAS(36, "Camisetas"), 
	CAMISAS(37, "Camisas"), 
	CASACOS(38, "Casacos"),
	INTIMA(39, "Moda Íntima"), 
	JAQUETAS(40, "Jaquetas");

	private int key;
	private String description;

	CategoryEnum(int key, String description) {
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
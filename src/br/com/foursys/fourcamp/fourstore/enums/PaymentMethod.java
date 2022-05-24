package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {
	
	DINHEIRO(66, "Dinheiro"),
	CARTAODECREDITO(67 ,"Cartão de Crédito"),
	CARTAODEDEBITO(68 ,"Cartão de Débito"),
	PIX(69, "Pix");
	
	private int key;
	private String description;
	
	PaymentMethod(int key, String description) {
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
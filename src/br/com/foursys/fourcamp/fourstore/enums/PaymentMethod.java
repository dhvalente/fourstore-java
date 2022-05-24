package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {
	
	DINHEIRO(66, "Dinheiro"),
	CARTAODECREDITO(67 ,"Cart�o de Cr�dito"),
	CARTAODEDEBITO(68 ,"Cart�o de D�bito"),
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
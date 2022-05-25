package br.com.foursys.fourcamp.fourstore.model;

public class Client {
	private String name;
	private String cpf;
	private String pixKey;
	
	public Client(String name, String cpf, String pixKey) {
		this.name = name;
		this.cpf = cpf;
		this.pixKey = pixKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPixKey() {
		return pixKey;
	}

	public void setPixKey(String pixKey) {
		this.pixKey = pixKey;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + this.name + " - " + "CPF: " +this.cpf; 
	}
	
	
}
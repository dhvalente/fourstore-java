package br.com.foursys.fourcamp.fourstore.model;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.enums.PaymentMethod;

public class Sale {
	private static Integer superId = 0;
	private Integer id;
	private Client client;
	private List<Product> products;
	private Double amountValue;
	private PaymentMethod paymentMethod;
	
	public Sale(Client client, List<Product> products, Double amountValue, PaymentMethod paymentMethod) {
		superId++;
		this.id = superId;
		this.client = client;
		this.products = products;
		this.amountValue = amountValue;
		this.paymentMethod = paymentMethod;
	}
	
	

	public Integer getId() {
		return id;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Double getAmountValue() {
		return amountValue;
	}

	public void setAmountValue(Double amountValue) {
		this.amountValue = amountValue;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
	
	
} 
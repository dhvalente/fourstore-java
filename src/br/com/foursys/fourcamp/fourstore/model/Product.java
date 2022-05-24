package br.com.foursys.fourcamp.fourstore.model;

public class Product {
	
	private String sku;
	private String id;
	private String description;
	private String type;
	private String size;
	private String color;
	private String category;
	private String season;
	private Integer quantity;
	private Double purchasePrice;
	private Double salePrice;

	

	public Product(String sku, Integer quantity) {	
		this.sku = sku;
		this.quantity = quantity;
	}	

	public Product(String sku, Integer quantity, Double purchasePrice, Double salePrice) {
		this.sku = sku;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		parseSku(sku);
	}
	


	public Product(String sku, String description, Integer quantity, Double purchasePrice, Double salePrice) {
		this.sku = sku;
		this.description = description;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.salePrice = salePrice;
		parseSku(sku);
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	

	
	
	private void parseSku(String sku) {
		this.id = sku.substring(0, 2);
		this.category = sku.substring(2, 4);
		this.color = sku.substring(4, 6);
		this.season = sku.substring(6, 10);
		this.type = sku.substring(10, 12);
		this.size = sku.substring(12, 14);
	}
	
	@Override
	public String toString() {
		return "Descrição: " + this.description + " - " + "Preço de venda: " +this.salePrice; 
	}

}
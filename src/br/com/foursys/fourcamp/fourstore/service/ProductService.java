package br.com.foursys.fourcamp.fourstore.service;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.exception.InvalidSellValueException;
import br.com.foursys.fourcamp.fourstore.exception.ProductNotFoundException;
import br.com.foursys.fourcamp.fourstore.exception.StockInsufficientException;
import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.model.Sale;

public class ProductService {

	private ProductData productData;

	public ProductService() {
		this.productData = new ProductData();
	}

	public String storeProduct(Product product, Integer quantity) throws InvalidSellValueException {
		validateProfit(product);
		productData.store(product);
		return "Adicionadas " + product;
	}

	public List<Product> listAll() {
		return productData.index();
	}

	public boolean validatePurchase(Sale sale) throws StockInsufficientException, ProductNotFoundException {
		return deductFromStock(sale);
	}

	public String highStockWarning(Product product) {
		Integer quantity = productData.show(product.getSku()).getQuantity();
		if (quantity >= 100) {
			return "Estoque alto: " + quantity + " unidades";
		} else {
			return null;
		}
	}

	public void deleteBySku(String sku) throws ProductNotFoundException {
		show(sku);
		productData.destroy(sku);
	}

	public Product show(String sku) throws ProductNotFoundException {
		if (productData.show(sku).equals(null)) {
			throw new ProductNotFoundException(sku);
		} else {
			return (Product) productData.show(sku);
		}
	}

	public boolean deductFromStock(Sale sale) throws ProductNotFoundException, StockInsufficientException {
		checkStock(sale.getProducts());
		return true;
	}

	public void update(String sku, Integer quantity) {
		productData.update(sku).setQuantity(quantity);
	}

	public void checkStock(List<Product> products) throws StockInsufficientException {		
		products.forEach((product) -> {				
			if(product.getQuantity() > productData.show(product.getSku()).getQuantity()) {
				try {
					throw new StockInsufficientException();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
	}

	private void validateProfit(Product product) throws InvalidSellValueException {
		if ((product.getPurchasePrice() * 1.25) > product.getSalePrice()) {
			throw new InvalidSellValueException();
		}
	}

}
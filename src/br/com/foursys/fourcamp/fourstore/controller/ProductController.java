package br.com.foursys.fourcamp.fourstore.controller;

import java.util.List;

import br.com.foursys.fourcamp.fourstore.exception.InvalidSellValueException;
import br.com.foursys.fourcamp.fourstore.exception.ProductNotFoundException;
import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class ProductController {
	private ProductService productService;

	public ProductController() {
		this.productService = new ProductService();
	}

	public boolean validateSku(String sku, int quantity) {
		return false;
	}

	public String storeProduct(String sku, String description, int quantity, double buyPrice, double sellPrice)
			throws InvalidSellValueException {
		if (sku.length() != 14) {
			return " SKU inválida ";
		}
		if (description == null || quantity <= 0 || buyPrice <= 0 || sellPrice <= 0) {
			return " Digite os valores corretos de acordo com cada campo ";
		}
		Product product = new Product(sku, description, quantity, buyPrice, sellPrice);
		return productService.storeProduct(product, quantity);
	}

	public Product findSku(String sku) throws ProductNotFoundException {
		return productService.show(sku);
	}

	public String index() {
		List<Product> listProduct = productService.listAll();
		return listProduct.toString();
	}

	public String delete(String sku) throws ProductNotFoundException {
		productService.deleteBySku(sku);
		return "Produto excluído com sucesso";
	}

	public String update(String sku, Integer quantity) throws ProductNotFoundException {
		if (productService.show(sku) == null) {
			return " Produto não encontrado!";
		}
		productService.update(sku, quantity);
		return " Produto atualizado com sucesso ";
	}

	/*
	 * public String update(String sku, Double buyPrice, Double sellPrice) throws
	 * ProductNotFoundException, InvalidSellValueException { Product product =
	 * productService.findBySku(sku); if (product == null) { return
	 * " Produto não encontrado!"; } product.setBuyPrice(buyPrice);
	 * product.setSellPrice(sellPrice); productService.validateProfit(product);
	 * return "Produto atualizado com sucesso "; }
	 */

}

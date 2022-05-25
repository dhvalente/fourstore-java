package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductData implements DataInterface {

	List<Product> listProduct = new ArrayList<>();

	@Override
	public List<Product> index() {
		return listProduct;
	}

	@Override
	public Product show(String sku) {
		return listProduct.stream().filter(p -> (p).getSku() == sku).findFirst().get();
	}

	@Override
	public Product store(Object object) {
		listProduct.add((Product)object);
		return (Product)object;
	}

	@Override
	public String destroy(String sku) {
		listProduct.removeIf(p -> ((Product) p).getSku() == sku);
		return sku;	
	}

	@Override
	public Product update(String sku) {
		return listProduct.stream().filter(p -> (p).getSku() == sku).findFirst().get();
	}
}

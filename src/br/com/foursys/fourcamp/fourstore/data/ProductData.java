package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Product;

public class ProductData implements DataInterface {

	List<Product> listProduct = new ArrayList<>();

	@Override
	public void index() {
		listProduct.forEach(System.out::println);
	}

	@Override
	public Object show(String sku) {
		Product product = listProduct.stream().filter(p -> p.getSku() == sku).findFirst().get();
		return product;
	}

	@Override
	public Object store(Object object) {
		listProduct.add((Product) object);
		return object;
	}

	@Override
	public String destroy(String sku) {
		listProduct.removeIf(p -> p.getSku() == sku);
		return sku;
	}

}

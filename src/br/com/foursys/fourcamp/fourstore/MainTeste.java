package br.com.foursys.fourcamp.fourstore;

import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.model.Product;

public class MainTeste {

	public static void main(String[] args) {
		ProductData product = new ProductData()	;
		Product p1 = new Product("14331160909251", "Bermuda Jeans ", 41, 35.00, 45.00);
		Product p2 = new Product("15342230609352", "Calca Skiny ", 23, 100.00, 145.00);
		Product p3 = new Product("16333330609454", "Camiseta Manga Longa ", 65, 10.00, 33.00);
		System.out.println("---------------------------------------");
		product.store(p1);
		product.store(p2);
		product.store(p3);
		product.index();
		System.out.println("---------------------------------------");
		product.destroy("15342230609352");
		product.index();
		System.out.println("---------------------------------------");
		System.out.println(product.show("14331160909251"));
		

	}

}

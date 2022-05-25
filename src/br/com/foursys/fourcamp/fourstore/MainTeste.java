package br.com.foursys.fourcamp.fourstore;

import br.com.foursys.fourcamp.fourstore.controller.ProductController;
import br.com.foursys.fourcamp.fourstore.data.ClientData;
import br.com.foursys.fourcamp.fourstore.data.ProductData;
import br.com.foursys.fourcamp.fourstore.exception.InvalidSellValueException;
import br.com.foursys.fourcamp.fourstore.exception.ProductNotFoundException;
import br.com.foursys.fourcamp.fourstore.model.Client;
import br.com.foursys.fourcamp.fourstore.model.Product;
import br.com.foursys.fourcamp.fourstore.service.ProductService;

public class MainTeste {

	public static void main(String[] args) throws InvalidSellValueException, ProductNotFoundException {
		ProductController pc = new ProductController();
		pc.storeProduct("15331160909451", "Camiseta Controler", 12, 10.00, 43.00);
		System.out.println(pc.findSku("15331160909451"));
		//pc.delete("15331160909451");
		pc.update("15331160909451", 45);
		System.out.println(pc.index());
	}

}

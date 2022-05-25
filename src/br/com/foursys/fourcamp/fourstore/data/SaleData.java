package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Sale;

public class SaleData implements DataInterface {
	List<Sale> listSale = new ArrayList<>();

	@Override
	public List<Sale>index() {
		return listSale;
	}

	@Override
	public Sale show(String id) {
		return listSale.stream().filter(s -> (s).getId() == Integer.parseInt(id)).findFirst().get();
	}

	@Override
	public Sale store(Object object) {
		listSale.add((Sale)object);
		return (Sale)object;
	}

	@Override
	public String destroy(String id) {
		listSale.removeIf(s -> ((Sale) s).getId() == Integer.parseInt(id));
		return id;	
	}

	@Override
	public Object update(String id) {
		return listSale.stream().filter(s -> (s).getId() == Integer.parseInt(id)).findFirst().get();
	}


}

package br.com.foursys.fourcamp.fourstore.data;

import java.util.List;


public interface DataInterface {

	public List<?> index();

	public Object show(String sku);

	public Object store(Object object);

	public String destroy(String sku);
	
	public Object update(String sku);
}

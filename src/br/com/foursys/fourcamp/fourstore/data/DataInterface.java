package br.com.foursys.fourcamp.fourstore.data;

public interface DataInterface {

	public void index();

	public Object show(String sku);

	public Object store(Object object);

	public String destroy(String sku);

}

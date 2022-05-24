package br.com.foursys.fourcamp.fourstore.data;

import java.util.ArrayList;
import java.util.List;

import br.com.foursys.fourcamp.fourstore.model.Client;

public class ClientData implements DataInterface {

	List<Client> listClient = new ArrayList<>();

	@Override
	public void index() {
		listClient.forEach(System.out::println);
	}

	@Override
	public Object show(String cpf) {
		Client client = listClient.stream().filter(c -> c.getCpf() == cpf).findFirst().get();
		return client;
	}

	@Override
	public Object store(Object object) {
		listClient.add((Client) object);
		return listClient;
	}

	@Override
	public String destroy(String cpf) {
		listClient.removeIf(p -> p.getCpf() == cpf);
		return cpf;
	}

}
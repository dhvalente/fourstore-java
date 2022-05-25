package br.com.foursys.fourcamp.fourstore.exception;

public class ClientNotFound extends Exception {

    private static final long serialVersionUID = 1L;

    public ClientNotFound(Long id) {
        super("Nenhum cliente encontrado com o cpf " + id);
    }

}
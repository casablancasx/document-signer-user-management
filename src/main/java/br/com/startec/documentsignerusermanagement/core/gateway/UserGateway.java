package br.com.startec.documentsignerusermanagement.core.gateway;

import br.com.startec.documentsignerusermanagement.core.entities.User;

public interface UserGateway {

    User createUser(User user);
    boolean emailExists(String email);

}

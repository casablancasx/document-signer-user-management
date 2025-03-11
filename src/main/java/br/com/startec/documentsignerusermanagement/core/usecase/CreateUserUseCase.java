package br.com.startec.documentsignerusermanagement.core.usecase;

import br.com.startec.documentsignerusermanagement.core.entities.User;

public interface CreateUserUseCase {

    User execute(User user);

}

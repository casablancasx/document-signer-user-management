package br.com.startec.documentsignerusermanagement.core.usecase;

import br.com.startec.documentsignerusermanagement.core.entities.User;

public interface FindUserByEmailUseCase {

    User execute(String email);

}

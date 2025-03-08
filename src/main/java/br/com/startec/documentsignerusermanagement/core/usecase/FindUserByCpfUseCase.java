package br.com.startec.documentsignerusermanagement.core.usecase;

import br.com.startec.documentsignerusermanagement.core.entities.User;

public interface FindUserByCpfUseCase {

    User execute(String cpf);
}

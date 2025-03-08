package br.com.startec.documentsignerusermanagement.core.usecase;

import br.com.startec.documentsignerusermanagement.core.entities.User;

import java.util.List;

public interface FindAllUsersUseCase {

    List<User> execute();

}

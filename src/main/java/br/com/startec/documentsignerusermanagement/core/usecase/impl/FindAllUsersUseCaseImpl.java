package br.com.startec.documentsignerusermanagement.core.usecase.impl;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.FindAllUsersUseCase;

import java.util.List;

public class FindAllUsersUseCaseImpl implements FindAllUsersUseCase {

    private final UserGateway userGateway;

    public FindAllUsersUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public List<User> execute() {
        return userGateway.findAllUsers();
    }
}

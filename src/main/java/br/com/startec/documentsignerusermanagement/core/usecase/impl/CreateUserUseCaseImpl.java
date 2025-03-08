package br.com.startec.documentsignerusermanagement.core.usecase.impl;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.CreateUserUseCase;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserGateway userGateway;

    public CreateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        if (userGateway.emailExists(user.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        return userGateway.createUser(user);
    }
}

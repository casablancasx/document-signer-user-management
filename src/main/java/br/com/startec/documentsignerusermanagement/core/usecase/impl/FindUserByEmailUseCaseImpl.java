package br.com.startec.documentsignerusermanagement.core.usecase.impl;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.FindUserByEmailUseCase;
import br.com.startec.documentsignerusermanagement.infrastructure.exception.UserNotFoundException;

public class FindUserByEmailUseCaseImpl implements FindUserByEmailUseCase {

    private final UserGateway userGateway;

    public FindUserByEmailUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(String email) {
        return userGateway.findUserByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("Nao foi possivel encontrar o usuario com o email: " + email));
    }
}

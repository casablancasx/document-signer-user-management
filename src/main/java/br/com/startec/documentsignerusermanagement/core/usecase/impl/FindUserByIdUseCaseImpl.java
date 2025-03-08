package br.com.startec.documentsignerusermanagement.core.usecase.impl;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.FindUserByIdUseCase;
import br.com.startec.documentsignerusermanagement.infrastructure.exception.UserNotFoundException;

import java.util.UUID;

public class FindUserByIdUseCaseImpl implements FindUserByIdUseCase {


    private final UserGateway userGateway;

    public FindUserByIdUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(UUID userId) {
        return userGateway.findUserById(userId)
                .orElseThrow(() -> new UserNotFoundException("Nao foi possivel encontrar o usuario com o id: " + userId));
    }
}

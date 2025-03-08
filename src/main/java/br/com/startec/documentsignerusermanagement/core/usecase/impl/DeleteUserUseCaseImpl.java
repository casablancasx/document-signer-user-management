package br.com.startec.documentsignerusermanagement.core.usecase.impl;

import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.DeleteUserUseCase;
import br.com.startec.documentsignerusermanagement.infrastructure.exception.UserNotFoundException;

import java.util.UUID;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserGateway userGateway;

    public DeleteUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public void execute(UUID userId) {
        if (!userGateway.existsUsetById(userId)) {
            throw new UserNotFoundException("Nao foi possivel encontrar o usuario com o id: " + userId);
        }
        userGateway.deleteUser(userId);
    }
}

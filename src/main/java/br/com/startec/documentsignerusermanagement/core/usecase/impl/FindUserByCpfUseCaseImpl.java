package br.com.startec.documentsignerusermanagement.core.usecase.impl;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.FindUserByCpfUseCase;
import br.com.startec.documentsignerusermanagement.infrastructure.exception.UserNotFoundException;

public class FindUserByCpfUseCaseImpl implements FindUserByCpfUseCase {

    private final UserGateway userGateway;

    public FindUserByCpfUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(String cpf) {
        return userGateway.findUserByCpf(cpf)
                .orElseThrow(() -> new UserNotFoundException("Nao foi possivel encontrar o usuario com o cpf: " + cpf));
    }
}

package br.com.startec.documentsignerusermanagement.core.usecase;

import br.com.startec.documentsignerusermanagement.core.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface FindUserByIdUseCase {

    User execute(UUID userId);
}

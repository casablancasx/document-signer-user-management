package br.com.startec.documentsignerusermanagement.core.usecase;

import java.util.UUID;

public interface DeleteUserUseCase {

    void execute(UUID userId);
}

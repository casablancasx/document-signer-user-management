package br.com.startec.documentsignerusermanagement.core.gateway;

import br.com.startec.documentsignerusermanagement.core.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserGateway {

    List<User> findAllUsers();
    Optional<User> findUserById(UUID userId);
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByCpf(String cpf);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(UUID userId);
    void validateCreateUser(User user);
    boolean existsUsetById(UUID userId);
    boolean authenticateUser(String email, String password);

}

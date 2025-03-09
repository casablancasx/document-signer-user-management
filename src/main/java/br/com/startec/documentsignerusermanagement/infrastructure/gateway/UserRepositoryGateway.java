package br.com.startec.documentsignerusermanagement.infrastructure.gateway;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.infrastructure.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return List.of();
    }

    @Override
    public Optional<User> findUserById(UUID userId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserByCpf(String cpf) {
        return Optional.empty();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void validateCreateUser(User user) {

    }

    @Override
    public void deleteUser(UUID userId) {

    }

    @Override
    public boolean existsUsetById(UUID userId) {
        return false;
    }

    @Override
    public boolean authenticateUser(String email, String password) {
        return false;
    }
}

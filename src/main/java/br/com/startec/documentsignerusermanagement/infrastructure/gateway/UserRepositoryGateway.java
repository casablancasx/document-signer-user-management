package br.com.startec.documentsignerusermanagement.infrastructure.gateway;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.infrastructure.dtos.in.LoginRequestDTO;
import br.com.startec.documentsignerusermanagement.infrastructure.dtos.out.LoginResponseDTO;
import br.com.startec.documentsignerusermanagement.infrastructure.exception.EmailAlreadyExistsException;
import br.com.startec.documentsignerusermanagement.infrastructure.mapper.UserEntityMapper;
import br.com.startec.documentsignerusermanagement.infrastructure.persistence.UserEntity;
import br.com.startec.documentsignerusermanagement.infrastructure.persistence.UserRepository;
import br.com.startec.documentsignerusermanagement.infrastructure.security.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class UserRepositoryGateway implements UserGateway {

    private final UserEntityMapper userEntityMapper;
    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

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
        validateCreateUser(user);
        UserEntity entity = userEntityMapper.mapToEntity(user);
        String encryptedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
        entity.setPassword(encryptedPassword);
        return userEntityMapper.mapToDomain(userRepository.save(entity));
    }

    @Override
    public LoginResponseDTO login(LoginRequestDTO data) {
        var userNamePassword = new UsernamePasswordAuthenticationToken(data.getEmail(), data.getPassword());
        var authentication = authenticationManager.authenticate(userNamePassword);
        String token  = tokenService.generateToken((User) authentication.getPrincipal());
        return new LoginResponseDTO(token);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void validateCreateUser(User user) {
        if(userRepository.existsByEmail(user.getEmail())) throw new EmailAlreadyExistsException("Já existe um email: " + user.getEmail() + " cadastrado no sistema");
        if(userRepository.existsByCpf(user.getCpf())) throw new EmailAlreadyExistsException("Já existe um CPF: " + user.getCpf() + " cadastrado no sistema");
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

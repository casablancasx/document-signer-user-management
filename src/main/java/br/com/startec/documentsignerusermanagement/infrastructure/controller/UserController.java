package br.com.startec.documentsignerusermanagement.infrastructure.controller;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.infrastructure.dtos.in.UserRegisterDTO;
import br.com.startec.documentsignerusermanagement.infrastructure.dtos.out.UserResponseDTO;
import br.com.startec.documentsignerusermanagement.infrastructure.gateway.UserRepositoryGateway;
import br.com.startec.documentsignerusermanagement.infrastructure.mapper.UserDtoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/api/user")
public class UserController {

    private final UserRepositoryGateway userRepositoryGateway;
    private final UserDtoMapper userDtoMapper;


    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> registerNewUser(@RequestBody @Valid UserRegisterDTO newUser) {
        User newUserDomain =  userRepositoryGateway.createUser(userDtoMapper.mapToDomain(newUser));
        User response = userRepositoryGateway.createUser(newUserDomain);
        return ResponseEntity.ok(userDtoMapper.mapToResponseDTO(response));
    }
}

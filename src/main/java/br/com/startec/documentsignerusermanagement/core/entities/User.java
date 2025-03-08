package br.com.startec.documentsignerusermanagement.core.entities;

import br.com.startec.documentsignerusermanagement.core.enuns.UserRole;

import java.util.UUID;

public class User {

    private final UUID userId;

    private final String cpf;

    private final String name;

    private final String email;

    private final String password;

    private final UserRole userRole;

    public User(UUID userId, String cpf, String name, String email, String password, UserRole userRole) {
        this.userId = userId;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getUserRole() {
        return userRole;
    }
}

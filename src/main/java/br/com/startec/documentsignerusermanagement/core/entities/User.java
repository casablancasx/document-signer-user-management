package br.com.startec.documentsignerusermanagement.core.entities;

import java.util.UUID;

public class User {

    private final UUID userId;

    private final String cpf;

    private final String name;

    private final String email;

    private final String password;

    public User(UUID userId, String cpf, String name, String email, String password) {
        this.userId = userId;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.password = password;
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

}

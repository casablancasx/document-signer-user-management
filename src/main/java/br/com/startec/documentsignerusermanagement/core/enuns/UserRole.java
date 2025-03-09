package br.com.startec.documentsignerusermanagement.core.enuns;

public enum UserRole {
    ADMIN("Admin"),
    ASSIGINEE("Assignee");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

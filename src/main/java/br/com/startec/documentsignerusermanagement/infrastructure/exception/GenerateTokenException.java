package br.com.startec.documentsignerusermanagement.infrastructure.exception;

public class GenerateTokenException extends RuntimeException {
    public GenerateTokenException(String message) {
        super(message);
    }
}

package br.com.startec.documentsignerusermanagement.infrastructure.exception.handler;

import br.com.startec.documentsignerusermanagement.infrastructure.exception.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler({EmailAlreadyExistsException.class})
    public ResponseEntity<StandardError> emailAlreadyExists(EmailAlreadyExistsException ex, HttpServletRequest request) {
        StandardError error = new StandardError();
        HttpStatus status = HttpStatus.CONFLICT;
        error.setStatus(status.value());
        error.setError("Já existe um usuário com o email informado");
        error.setMessage(ex.getMessage());
        error.setPath(request.getRequestURI());
        error.setTimestamp(java.time.Instant.now());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler({CpfAlreadyExistsException.class})
    public ResponseEntity<StandardError> cpfAlreadyExists(CpfAlreadyExistsException ex, HttpServletRequest request) {
        StandardError error = new StandardError();
        HttpStatus status = HttpStatus.CONFLICT;
        error.setStatus(status.value());
        error.setError("O CPF informado já está cadastrado");
        error.setMessage(ex.getMessage());
        error.setPath(request.getRequestURI());
        error.setTimestamp(java.time.Instant.now());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<StandardError> userNotFound(UserNotFoundException ex, HttpServletRequest request) {
        StandardError error = new StandardError();
        HttpStatus status = HttpStatus.NOT_FOUND;
        error.setStatus(status.value());
        error.setError("Usuário não encontrado");
        error.setMessage(ex.getMessage());
        error.setPath(request.getRequestURI());
        error.setTimestamp(java.time.Instant.now());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler({InvalidCredentialsException.class})
    public ResponseEntity<StandardError> invalidCredentials(InvalidCredentialsException ex, HttpServletRequest request) {
        StandardError error = new StandardError();
        HttpStatus status = HttpStatus.UNAUTHORIZED;
        error.setStatus(status.value());
        error.setError("Email ou senha inválidos");
        error.setMessage(ex.getMessage());
        error.setPath(request.getRequestURI());
        error.setTimestamp(java.time.Instant.now());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler({GenerateTokenException.class})
    public ResponseEntity<StandardError> generateTokenException(GenerateTokenException ex, HttpServletRequest request) {
        StandardError error = new StandardError();
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        error.setStatus(status.value());
        error.setError("Erro ao gerar token");
        error.setMessage(ex.getMessage());
        error.setPath(request.getRequestURI());
        error.setTimestamp(java.time.Instant.now());
        return ResponseEntity.status(status).body(error);
    }

}

package br.com.startec.documentsignerusermanagement.infrastructure.dtos.in;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterDTO {

    @NotBlank(message = "Informe o CPF")
    private String cpf;
    @NotBlank(message = "Informe o nome")
    private String name;
    @NotBlank(message = "Informe o email")
    private String email;
    @NotBlank(message = "Informe a senha")
    private String password;

}

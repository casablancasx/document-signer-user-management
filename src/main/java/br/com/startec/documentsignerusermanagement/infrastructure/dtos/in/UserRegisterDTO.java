package br.com.startec.documentsignerusermanagement.infrastructure.dtos.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterDTO {

    private String cpf;
    private String name;
    private String email;
    private String password;

}

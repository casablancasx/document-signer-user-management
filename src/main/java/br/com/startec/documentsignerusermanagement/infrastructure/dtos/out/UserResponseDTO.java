package br.com.startec.documentsignerusermanagement.infrastructure.dtos.out;

import br.com.startec.documentsignerusermanagement.core.enuns.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {

    private UUID userId;
    private String name;
    private String email;
    private UserRole role;

}
package br.com.startec.documentsignerusermanagement.infrastructure.mapper;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.infrastructure.dtos.in.UserRegisterDTO;
import br.com.startec.documentsignerusermanagement.infrastructure.dtos.out.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserDtoMapper {


    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "role", defaultValue = "ASSIGINEE")
    User mapToDomain(UserRegisterDTO userRegisterDTO);


    UserResponseDTO mapToResponseDTO(User user);


}

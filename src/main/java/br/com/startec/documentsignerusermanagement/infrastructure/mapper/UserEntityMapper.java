package br.com.startec.documentsignerusermanagement.infrastructure.mapper;

import br.com.startec.documentsignerusermanagement.core.entities.User;
import br.com.startec.documentsignerusermanagement.infrastructure.persistence.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserEntityMapper {

    UserEntity mapToEntity(User user);

    User mapToDomain(UserEntity userEntity);

}

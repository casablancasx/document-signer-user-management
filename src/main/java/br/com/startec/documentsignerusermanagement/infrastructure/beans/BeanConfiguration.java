package br.com.startec.documentsignerusermanagement.infrastructure.beans;


import br.com.startec.documentsignerusermanagement.core.gateway.UserGateway;
import br.com.startec.documentsignerusermanagement.core.usecase.*;
import br.com.startec.documentsignerusermanagement.core.usecase.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserUseCaseImpl(userGateway);
    }

    @Bean
    public FindAllUsersUseCase findAllUsersUseCase(UserGateway userGateway) {
        return new FindAllUsersUseCaseImpl(userGateway);
    }

    @Bean
    public FindUserByEmailUseCase findUserByEmailUseCase(UserGateway userGateway) {
        return new FindUserByEmailUseCaseImpl(userGateway);
    }

    @Bean
    public FindUserByCpfUseCase findUserByCpfUseCase(UserGateway userGateway) {
        return new FindUserByCpfUseCaseImpl(userGateway);
    }

    @Bean
    public FindUserByIdUseCase findUserByIdUseCase(UserGateway userGateway) {
        return new FindUserByIdUseCaseImpl(userGateway);
    }

    @Bean
    public UpdateUserUseCase updateUserUseCase(UserGateway userGateway) {
        return new UpdateUserUseCaseImpl(userGateway);
    }


    @Bean
    public DeleteUserUseCase deleteUserUseCase(UserGateway userGateway) {
        return new DeleteUserUseCaseImpl(userGateway);
    }



}

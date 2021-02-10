package co.com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.main.drivenadapter.RestPerson;
import co.com.main.usecase.AliasUseCase;

@Configuration
public class UseCaseConfig {

	@Bean
    public AliasUseCase keysCommonUseCase(RestPerson rest) {
        return new AliasUseCase(rest);
    }
}

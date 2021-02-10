package co.com.main.entrypoint;

import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import co.com.main.model.Person;
import co.com.main.usecase.AliasUseCase;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class HandlerAlias {

	private final AliasUseCase useCase;
	
	public Mono<ServerResponse> consultAlias(ServerRequest request) {
	
		Mono<String> result = request
				.bodyToMono(Person.class)
				.flatMap(useCase::consultAlias);
		
		return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(result, String.class);
	}
}

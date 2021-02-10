package co.com.main.drivenadapter;

import org.springframework.context.annotation.Configuration;

import co.com.main.model.Person;
import co.com.main.model.port.OperationsPerson;
import reactor.core.publisher.Mono;

@Configuration
public class RestPerson implements OperationsPerson{

	@Override
	public Mono<String> getAlias(Person person) {
		return Integer.parseInt(person.getDocument()) == 10 ? Mono.just("brayan90") : Mono.just("juan123");
	}

}

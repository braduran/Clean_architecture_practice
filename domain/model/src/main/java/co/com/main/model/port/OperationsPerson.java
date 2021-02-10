package co.com.main.model.port;

import co.com.main.model.Person;
import reactor.core.publisher.Mono;

public interface OperationsPerson {

	Mono<String> getAlias(Person person);
}

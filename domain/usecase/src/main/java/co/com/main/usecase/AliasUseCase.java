package co.com.main.usecase;

import co.com.main.model.Person;
import co.com.main.model.port.OperationsPerson;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class AliasUseCase {

	private final OperationsPerson op;
	
	public Mono<String> consultAlias(Person p){
		return op.getAlias(p);
	}
	
}

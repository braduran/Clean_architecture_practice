package co.com.main.entrypoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterAlias {
	
	@Bean
    public RouterFunction<ServerResponse> routesMappings(HandlerAlias handler) {
        return RouterFunctions.route()
        		.GET("/getAlias", RequestPredicates.accept(MediaType.APPLICATION_JSON), handler::consultAlias)
        		.build();
    }
}

package com.gateway.org;

import org.springframework.stereotype.*;
import org.springframework.web.server.*;
import reactor.core.publisher.*;

@Component("SimpleClientAddressResolver")
public class SimpleClientAddressResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just("1");
    }
}

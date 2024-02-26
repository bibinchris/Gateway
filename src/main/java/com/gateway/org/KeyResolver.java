package com.gateway.org;

import org.springframework.web.server.*;
import reactor.core.publisher.*;

public interface KeyResolver {
    Mono<String> resolve(ServerWebExchange exchange);
}

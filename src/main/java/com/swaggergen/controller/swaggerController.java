package com.swaggergen.controller;

import com.openapi.gen.springboot.api.UserApi;
import com.openapi.gen.springboot.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.UUID;

/**
 * @author mabbasi
 */
@RestController
public class swaggerController implements UserApi {
    @Override
    public Mono<ResponseEntity<UserDTO>> saveUser(Mono<UserDTO> userDTO, ServerWebExchange exchange) {

        return userDTO.log().map(b-> ResponseEntity.created(URI.create("/user"))
                        .body(new UserDTO().cell(b.getCell()).id(b.getId()).ssn(b.getSsn()).firstName(b.getFirstName()).lastName(b.getLastName()))) ;

//        return UserApi.super.saveUser(userDTO, exchange);
    }
}

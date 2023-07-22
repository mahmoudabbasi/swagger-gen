package com.swaggergen.delegate;

import com.openapi.gen.springboot.dto.UserDTO;
import com.swaggergen.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * @author mabbasi
 */
@Service
public class UserDelegateImpl  {

//    private final UserService userService;
//
//    public UserDelegateImpl(UserService userService) {
//        this.userService = userService;
//    }
//
//
//    @Override
//    public Mono<ResponseEntity<UserDTO>> getUserById(UUID id, ServerWebExchange exchange) {
//        return UserApiDelegate.super.getUserById(id, exchange);
//    }
//
//    @Override
//    public Mono<ResponseEntity<UserDTO>> saveUser(Mono<UserDTO> userDTO, ServerWebExchange exchange) {
//        return UserApiDelegate.super.saveUser(userDTO, exchange);
//    }
    
}

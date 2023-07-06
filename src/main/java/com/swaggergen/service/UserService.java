package com.swaggergen.service;

import com.openapi.gen.springboot.dto.UserDTO;
import com.swaggergen.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class UserService {
    private final Map<UUID,UserDTO> db = new ConcurrentHashMap<>();

    public UserDTO saveUser(UserDTO userDTO) {
        UUID uuid= UUID.randomUUID();
        userDTO.setId(uuid);
        db.put(uuid,userDTO);
        return userDTO ;
    }


    public UserDTO getUserById(UUID id) {
        return Optional.ofNullable(db.get(id))
                .orElseThrow(()->new UserNotFoundException(" User not Found for Id" + id)) ;
    }
}

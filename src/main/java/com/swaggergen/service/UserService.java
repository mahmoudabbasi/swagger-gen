package com.swaggergen.service;

import com.openapi.gen.springboot.dto.UserDTO;
import com.swaggergen.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mabbasi
 */
@Service
public class UserService {

    private final Map<UUID, UserDTO> db = new ConcurrentHashMap<>();


    public UserDTO saveUser(UserDTO userDTO) {
        UUID uuid = UUID.randomUUID();
        userDTO.setId(uuid);
        db.put(uuid, userDTO);
        return userDTO;
    }

    public UserDTO getUser(UUID id) {
        return Optional.ofNullable(db.get(id))
                .orElseThrow(() -> new UserNotFoundException("User not found for Id: " + id));
    }
    
}

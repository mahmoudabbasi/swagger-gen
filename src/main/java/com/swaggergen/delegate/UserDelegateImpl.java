package com.swaggergen.delegate;

import com.openapi.gen.springboot.api.UserApiDelegate;
import com.openapi.gen.springboot.dto.UserDTO;
import com.swaggergen.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
//@RequiredArgsConstructor
public class UserDelegateImpl implements UserApiDelegate {


    private final UserService userService ;

    public UserDelegateImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserDTO> saveUser(UserDTO userDTO) {
//        return UserApiDelegate.super.saveUser(userDTO);
        return ResponseEntity.ok(userService.saveUser(userDTO));
    }


    @Override
    public ResponseEntity<UserDTO> getUserById(UUID id) {

//        return UserApiDelegate.super.getUserById(id);
        return ResponseEntity.ok(userService.getUserById(id)) ;

    }
}

package com.swaggergen.contoller;

import com.openapi.gen.springboot.api.UserApiController;
import com.openapi.gen.springboot.api.UserApiDelegate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author mabbasi
 */
@RestController
@Validated
public class SwaggerContoller extends UserApiController {


    public SwaggerContoller(UserApiDelegate delegate) {
        super(delegate);
    }

//    public SwaggerContoller(UserApiDelegate delegate) {
//        super(delegate);
//    }

   /* @Override
    public ResponseEntity<UserDTO> getUserById(UUID id) {
        checked(id) ;
        return super.getUserById(id);
    }

    private void checked(UUID id) {


        System.out.println(id);
    }*/
}

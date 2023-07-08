package com.swaggergen.config;

import com.openapi.gen.springboot.dto.Error;
import com.swaggergen.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionTranslator {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Error> handleUserNotFoundException(UserNotFoundException e) {
        return ResponseEntity.ok(generateError(e.getMessage(), HttpStatus.NOT_FOUND.value())) ;
    }


    public Error generateError(String message , Integer code) {
        Error error = new Error();
        error.setCode(code);
        error.setMessage(message);
        return error ;
    }
}

package com.swaggergen.config;

import com.openapi.gen.springboot.dto.Error;
import com.openapi.gen.springboot.dto.ErrorMethod;
import com.openapi.gen.springboot.dto.ErrorModel;
import com.swaggergen.exception.ExceptionMessages;
import com.swaggergen.exception.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;

@Slf4j
@ControllerAdvice
public class ExceptionTranslator  {



    
   @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorModel> handleUserNotFoundException(UserNotFoundException e) {
        return ResponseEntity.ok(generateError(e.getMessage(), HttpStatus.NOT_FOUND.value())) ;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorModel> handleConstraintViolation(Exception e,
                                                                    WebRequest request) {
        return ResponseEntity.ok(generateError("test", 401)) ;
    }





    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorModel> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {

         ErrorModel errorModel = new ErrorModel();
        errorModel.setErrorCode(HttpStatus.BAD_REQUEST.value());
        errorModel.setErrorDesc(ExceptionMessages.Global.NOT_VALID_ARGUMENTS );

        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            ErrorMethod apiValidationError = new ErrorMethod() ;
            apiValidationError.setErrorCode(400);
            apiValidationError.setErrorMessage(fieldError.getDefaultMessage()); ;
            apiValidationError.setField(fieldError.getField());
            
//                    .field(fieldError.getField())
//                    .message(this.getMessage(fieldError.getDefaultMessage(), locale))
//                    .rejectedValue(fieldError.getRejectedValue())
//                    .object(fieldError.getObjectName())
//                    .build();

            errorModel.addFieldItem(apiValidationError);
        }

        return ResponseEntity.badRequest().body(errorModel);
    }





    public ErrorModel generateError(String message , Integer code) {
        ErrorModel error = new ErrorModel();
        error.setErrorCode(code);
        error.setErrorDesc(message);
        error.setField(new ArrayList<>());

        return error ;
    }
}

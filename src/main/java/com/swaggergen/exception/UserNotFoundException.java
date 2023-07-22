package com.swaggergen.exception;

/**
 * @author mabbasi
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }

}

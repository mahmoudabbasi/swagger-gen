package com.swaggergen.validators;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author mabbasi
 */
@Documented
@Constraint(validatedBy = {CapitalizedValidator.class})
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Capitalized {
    String message() default "Name should be capitalized.";
    boolean required() default true;
}

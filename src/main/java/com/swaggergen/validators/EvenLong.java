package com.swaggergen.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
/**
 * @author mabbasi
 */
//@Documented
@Documented
@Constraint(validatedBy = EvenLongValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface EvenLong {
    String message() default "Not an even number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String[] values() default {};
}
package com.swaggergen.validators;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @author mabbasi
 */
public class CapitalizedValidator implements ConstraintValidator<Capitalized, String> {

    private Capitalized uppercaseAnnotation;

    public void initialize(Capitalized constraintAnnotation) {
        this.uppercaseAnnotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(String nameField, ConstraintValidatorContext context) {
        String correctName = buildCorrectName(nameField);
        if (uppercaseAnnotation.required()
                && (Objects.isNull(nameField)  || nameField.isBlank()
                || !correctName.equals(nameField))) {
            context = context
                    .buildConstraintViolationWithTemplate(this.uppercaseAnnotation.message())
                    .addConstraintViolation();
            context.disableDefaultConstraintViolation();
            return false;
        }
        return true;
    }

    private String buildCorrectName(String nameField) {
        String upCase = String.valueOf(nameField.charAt(0)).toUpperCase();
        String lowCase = nameField.substring(1).toLowerCase();
        return upCase.concat(lowCase);
    }
}
package com.swaggergen.validators;



import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author mabbasi
 */
public class EvenLongValidator implements ConstraintValidator<EvenLong, String> {


    private EvenLong uppercaseAnnotation;
    @Override
    public void initialize(EvenLong contactNumber) {
        this.uppercaseAnnotation = contactNumber;
    }

    @Override
    public boolean isValid(String nameField, ConstraintValidatorContext context) {
        if (nameField.length()!=10) {
            context = context
                    .buildConstraintViolationWithTemplate(this.uppercaseAnnotation.message())
                    .addConstraintViolation();
            context.disableDefaultConstraintViolation();
            return false;
        }
        return true;

//        return s.length()==10 ?true : false;
    }

//    @Override
//    public boolean isValid(Long num, ConstraintValidatorContext constraintValidatorContext) {
//        return num == null || num % 2 == 0;
//    }

}
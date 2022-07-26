package org.jose111.models;

import java.util.function.Predicate;

import static java.text.MessageFormat.format;

public interface IPredicate {
    Predicate<String> isPhoneNumberValidPredicate = (phoneNumber) -> {
        final var result = phoneNumber.startsWith("07") && phoneNumber.length() == 11;
        System.out.println(format("*. Is the phone number valid: {0}", result));
        
        return result;
    };
    
    Predicate<String> containsTheNumber3Predicate = (number) -> number.contains("3");
}

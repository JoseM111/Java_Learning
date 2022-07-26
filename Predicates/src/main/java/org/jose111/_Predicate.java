package org.jose111;

import org.jose111.models.IPredicate;

import static java.text.MessageFormat.format;
import static org.jose111.models.IPredicate.containsTheNumber3Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // should be false
        boolean containsTheNumber3 = IPredicate.isPhoneNumberValidPredicate.and(
            containsTheNumber3Predicate
        ).test("09009877300");
        
        // should be true
        boolean containsTheNumber3V2 = IPredicate.isPhoneNumberValidPredicate.or(
            containsTheNumber3Predicate
        ).test("09009877300");
        
        System.out.println("================================================");
        System.out.println("[  predicate: EXAMPLE  ]");
        System.out.println("------------------------------------------------");
    
        IPredicate.isPhoneNumberValidPredicate.test("07000000000");
        IPredicate.isPhoneNumberValidPredicate.test("09009877300");
        
        
    
        System.out.println(format("*. Does the phone number contain 3: {0}", containsTheNumber3));
        System.out.println(format("*. Does the phone number contain 3: {0}", containsTheNumber3V2));
        System.out.println("================================================\n");
    }
}
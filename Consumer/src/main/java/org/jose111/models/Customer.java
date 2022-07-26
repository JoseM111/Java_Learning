package org.jose111.models;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Customer {
    private final String customerName;
    private final String customerPhoneNumber;
    
    // constructor
    public Customer(String customerName, String customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    
    /** <Functional> one arg example: */
    // Even though the consumer displays as a return type, it is void
    public static Consumer<Customer> greetCustomerConsumer = (customer) -> {
        var textBlock = """
                        *. Hello %s
                        *. thanks for registering with phone number %s
                        """
            .trim()
            .formatted(
                customer.customerName,
                customer.customerPhoneNumber
            );
        
        System.out.println(textBlock);
    };
    
    public static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> {
        var textBlock = """
                        *. Hello %s
                        *. thanks for registering with phone number %s
                        """
            .trim()
            .formatted(
                customer.customerName,
                (showPhoneNumber ? customer.customerPhoneNumber : "***-***-****")
            );
        
        System.out.println(textBlock);
    };
    
    // Regular method
    public static void greetCustomer(Customer customer) {
        var textBlock = """
                        *. Hello %s
                           , thanks for registering with the phone number %s
                        """
            .trim()
            .formatted(
                customer.customerName,
                customer.customerPhoneNumber
            );
        
        System.out.println(textBlock);
    }
}

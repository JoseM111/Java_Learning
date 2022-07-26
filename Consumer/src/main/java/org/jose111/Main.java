package org.jose111;

import org.jose111.models.Customer;
import org.jose111.models.ILambda;

import java.text.MessageFormat;

import static java.text.MessageFormat.*;

public class Main {
    public static void main(String[] args) {
        var maria = new Customer(
            "Maria",
            "978-390-7766"
        );
        
        // Custom Lambda function
        ILambda lambda = (number) -> {
            return number * number;
        };
        
        System.out.println("================================================");
        System.out.println("[  consumer: EXAMPLE  ]");
        System.out.println("------------------------------------------------");
        
        // Normal Java static Method
        Customer.greetCustomer(maria);
        // Consumer Functional example
        Customer.greetCustomerConsumer.accept(maria);
        // BiConsumer Functional example
        Customer.greetCustomerConsumerV2.accept(maria, false);
        
        System.out.println(format("*. lambda = {0}", lambda.display(12)));
        System.out.println("================================================\n");
    }
}
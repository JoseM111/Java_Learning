package org.jose111;

import static java.text.MessageFormat.*;
import static org.jose111.models.IFunctional.*;

public class Main {
    public static void main(String[] args) {
        // var increment = increment(0);
        int increment = incrementByOneFunction.apply(1);
        int multiply = multiplyFunction.apply(increment, 10);
    
        System.out.println("================================================");
        System.out.println("[  functional-interface: EXAMPLE  ]");
        System.out.println("------------------------------------------------");
        
        System.out.println(format("*. incrementing: {0}", increment));
        System.out.println(format("*. multiply: {0}", multiply));
        System.out.println("================================================\n");
    }
    /*
    static int increment(int number) {
        return number + 1;
    }
*/
}
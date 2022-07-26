package org.jose111.models;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface IFunctional {
    Function<Integer, Integer> incrementByOneFunction = (number) -> (
        number + 1
    );
    
    BiFunction<Integer, Integer, Integer> multiplyFunction = (num1, num2) -> (
        num1 * num2
    );
    
}

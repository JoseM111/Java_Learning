package org.jose111;

import java.util.ArrayList;

import static java.text.MessageFormat.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        
        // Retrieving
        var retrievingData = numbers.get(0);
    
        run(numbers, retrievingData);
    }
    
    private static void run(ArrayList<Integer> numbers, Integer retrievingData) {
        System.out.println("================================================");
        System.out.println("[  ARRAYLIST EXAMPLE  ]");
        System.out.println("------------------------------------------------");
        
        System.out.println(format("*. retrievingData=>: {0}", retrievingData));
        // Indexed for-loop
        legacyForLoop(numbers);
        // for item in list
        newForLoop(numbers);
        // forEach
        forEachLoop(numbers);
        System.out.println("================================================\n");
    }
    
    private static void legacyForLoop(ArrayList<Integer> numbers) {
        System.out.println("\n*. (Legacy for-loop)Iteration #1: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
    
    private static void newForLoop(ArrayList<Integer> numbers) {
        System.out.println("\n*. (new for-loop)Iteration #2: ");
        for (var number: numbers) {
            System.out.println(number);
        }
    }
    
    private static void forEachLoop(ArrayList<Integer> numbers) {
        System.out.println("\n*. (forEach loop)Iteration #3: ");
        numbers.forEach(System.out::println);
    }
}
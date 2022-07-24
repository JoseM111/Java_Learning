package org.jose111;

import org.jose111.models.Person;

import java.util.List;
import java.util.stream.Collectors;

import static org.jose111.models.Person.Gender.*;

public class Main {
    public static void main(String[] args) {
        // List of people
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );
        
        
    
        System.out.println("================================================");
        System.out.println("[  filter, forEach EXAMPLE  ]");
        System.out.println("------------------------------------------------");
    
        // Declarative approach
        filterWithForEach(people);
        System.out.println("================================================\n");
    }
    
    private static void filterWithForEach(List<Person> people) {
        people.stream()
            .filter((person) -> {
                // Getting all FEMALES in the list
                return FEMALE.equals(person.getGender());
            })
            .toList()
            .forEach(System.out::println);
    }
}
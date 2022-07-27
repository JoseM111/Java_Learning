package jose111.streams;

import jose111.streams.models.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.text.MessageFormat.format;
import static jose111.streams.models.Person.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        // List of people
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );
        
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender());
        Predicate<Person> personPredicate2 = (person) -> UNKNOWN.equals(person.gender());
        
        // true if all females in the list
        boolean containsOnlyFemales = people.stream().allMatch(personPredicate);
        // true if only one female exist
        boolean containsAtleastOneFemales = people.stream().anyMatch(personPredicate);
        // false if unknown
        boolean containsUnknownGender = people.stream().anyMatch(personPredicate2);
        
        System.out.println("================================================");
        System.out.println("[  stream: EXAMPLE  ]");
        System.out.println("------------------------------------------------");
        
        // using map & forEach stream
        usingMapAndForEachGender(people);
        // allMatch to only females
        System.out.println(format("* allMatch to only females: {0}", containsOnlyFemales));
        System.out.println(format("* anyMatch that is a females: {0}", containsAtleastOneFemales));
        System.out.println(format("* anyMatch that is a unknown: {0}", containsUnknownGender));
        System.out.println("================================================\n");
    }
    
    private static void usingMapAndForEachGender(List<Person> people) {
        people.stream()
              .map(Person::gender)
              .collect(Collectors.toSet())
              .forEach((gender) -> {
                      System.out.println(format("*. mapped genders: {0}", gender));
                  }
              );
    }
}
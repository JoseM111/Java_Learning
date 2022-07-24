package org.jose111.models;

public class Person {
    private final String name;
    private final Gender gender;
    
    public enum Gender {
        MALE, FEMALE,
    }
    
    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }
    
    public Gender getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return """
               Person { "name": %s, "gender": %s }
               """
            .trim()
            .formatted(name, gender);
    }
}

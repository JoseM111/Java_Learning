package jose111.streams.models;

public record Person(String name, Gender gender) {
    // enum
    public enum Gender {
        MALE,
        FEMALE,
        UNKNOWN
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

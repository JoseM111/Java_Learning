package jose111.models;

import java.util.List;
import java.util.function.Supplier;

import static java.text.MessageFormat.format;

public interface ISupplier {
    Supplier<String> getDBConnectionURLSupplier = () -> {
        final var result = "jdbc://localhost:5432/users";
        System.out.println(format("*. Database URL at: {0}", result));
        return result;
    };
    
    Supplier<List<String>> getDBConnectionURLSSupplier = () -> {
        final List<String> results = List.of(
            "jdbc://localhost:5432/users", "jdbc://localhost:5432/customers"
        );
        System.out.println(format("*. Database URL at: {0}", results));
        return results;
    };
}

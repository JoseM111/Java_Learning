package jose111;

import jose111.models.ISupplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("[  supplier: EXAMPLE  ]");
        System.out.println("------------------------------------------------");
        
        // Getting single url
        ISupplier.getDBConnectionURLSupplier.get();
        // getting a list of url's
        ISupplier.getDBConnectionURLSSupplier.get();
        System.out.println("================================================\n");
    }
}
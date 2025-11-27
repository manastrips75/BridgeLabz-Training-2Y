import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String id;
    Invoice(String id) { this.id = id; }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> txn = Arrays.asList("T1", "T2", "T3");
        List<Invoice> invoices = txn.stream().map(Invoice::new).collect(Collectors.toList());
        invoices.forEach(i -> System.out.println(i.id));
    }
}

import java.util.*;

class Productsam {
    String name;
    double quantity, pricePerUnit;
    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
    double getTotal() {
        return quantity * pricePerUnit;
    }
}

class Customer {
    String name;
    List<Product> products = new ArrayList<>();
    Customer(String name) { this.name = name; }
    void addProduct(Product p) { products.add(p); }
    List<Product> getProducts() { return products; }
}

class BillGenerator {
    double generateBill(Customer c) {
        double total = 0;
        for (Product p : c.getProducts()) total += p.getTotal();
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer c = new Customer("Alice");
        c.addProduct(new Product("Apples", 2, 3));
        c.addProduct(new Product("Milk", 1, 2));

        BillGenerator bg = new BillGenerator();
        System.out.println(c.name + "'s Total Bill: $" + bg.generateBill(c));
    }
}

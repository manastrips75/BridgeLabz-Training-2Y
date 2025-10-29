import java.util.*;

class Product {
    private String name;
    private double price;
    public Product(String name, double price) { this.name = name; this.price = price; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();
    public Order(int orderId) { this.orderId = orderId; }
    public void addProduct(Product p) { products.add(p); }
    public double getTotal() {
        double total = 0;
        for (Product p : products) total += p.getPrice();
        return total;
    }
    public void showOrder() {
        System.out.println("\nOrder ID: " + orderId + " | Products:");
        for (Product p : products)
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        System.out.println("Total: ₹" + getTotal());
    }
}

class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();
    public Customer(String name) { this.name = name; }
    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order ID " + o.hashCode());
    }
    public void showOrders() {
        System.out.println("\nCustomer: " + name + " | Orders:");
        for (Order o : orders) o.showOrder();
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 65000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Headphones", 2500);

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c2.placeOrder(o2);

        c1.showOrders();
        c2.showOrders();
    }
}

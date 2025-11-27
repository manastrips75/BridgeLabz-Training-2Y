import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }
}

public class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("A", 500, 4.5, 10),
                new Product("B", 300, 4.8, 15),
                new Product("C", 800, 4.0, 20)
        );

        products.sort((x, y) -> Double.compare(x.price, y.price));
        products.forEach(p -> System.out.println(p.name));
    }
}

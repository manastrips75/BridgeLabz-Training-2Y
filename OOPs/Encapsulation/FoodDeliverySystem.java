interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public String getItemName() { return itemName; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Qty: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return calculateTotalPrice() * 0.10; }
    public String getDiscountDetails() { return "10% discount on Veg items"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return (getPrice() * getQuantity()) + 20; } // extra charge
    public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    public String getDiscountDetails() { return "5% discount on Non-Veg items"; }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1)
        };

        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + (total - discount) + "\n");
        }
    }
}

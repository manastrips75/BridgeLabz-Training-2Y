class Order {
    String orderId, orderDate;
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order Shipped, Tracking No: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderApp {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("O1001", "2025-10-27", "TRK98765", "2025-10-29");
        System.out.println("Status: " + d.getOrderStatus());
    }
}

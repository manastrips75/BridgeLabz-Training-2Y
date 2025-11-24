interface PaymentProcessor {
    void pay(double amt);
    default void refund(double amt) {
        System.out.println("Refunding: " + amt);
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amt) {
        System.out.println("Paid using Paytm: " + amt);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor p = new Paytm();
        p.pay(500);
        p.refund(200);
    }
}

import java.util.Scanner;

public class StudentFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Student Fee: ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the University Discount Percent: ");
        double discountPercent = scanner.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("Discount Amount: " + discount);
        System.out.println("Fee to Pay after Discount: " + finalFee);

        scanner.close();
    }
}

public class ATMT {
    public static void main(String[] args) {
        int[] transactions = {2000, -500, 1000, -200, -700};
        int balance = 0;

        for (int transaction : transactions) {
            balance += transaction;
        }

        System.out.println("Final Balance: ₹" + balance);

        if (balance < 0) {
            System.out.println("Overdraft");
       }
   }
}
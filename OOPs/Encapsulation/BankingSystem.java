interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber, holderName;
    private double balance;

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance!");
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println(holderName + " | " + accountNumber + " | Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double bal) { super(accNo, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amt) { System.out.println("Savings loan applied: " + amt); }
    public boolean calculateLoanEligibility() { return getBalance() >= 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double bal) { super(accNo, name, bal); }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amt) { System.out.println("Business loan applied: " + amt); }
    public boolean calculateLoanEligibility() { return getBalance() >= 50000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S101", "Alice", 15000),
            new CurrentAccount("C202", "Bob", 60000)
        };

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(20000);
                System.out.println("Eligible: " + l.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}

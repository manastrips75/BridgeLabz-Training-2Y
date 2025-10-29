class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;
    CheckingAccount(String accNo, double balance, int limit) {
        super(accNo, balance);
        this.withdrawalLimit = limit;
    }
    void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: " + withdrawalLimit + " times/month");
    }
}

class FixedDepositAccount extends BankAccount {
    int duration;
    FixedDepositAccount(String accNo, double balance, int duration) {
        super(accNo, balance);
        this.duration = duration;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account - Duration: " + duration + " months");
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S101", 5000, 4.5);
        CheckingAccount c = new CheckingAccount("C202", 3000, 5);
        FixedDepositAccount f = new FixedDepositAccount("F303", 10000, 12);

        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}

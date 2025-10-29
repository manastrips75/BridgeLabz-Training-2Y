import java.util.*;

class Account {
    private int accNo;
    private double balance;
    public Account(int accNo, double balance) {
        this.accNo = accNo; this.balance = balance;
    }
    public double getBalance() { return balance; }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();
    public Customer(String name) { this.name = name; }
    public void addAccount(Account a) { accounts.add(a); }
    public void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account a : accounts)
            System.out.println("Balance: " + a.getBalance());
    }
}

class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();
    public Bank(String name) { this.name = name; }
    public void openAccount(Customer c, int accNo, double bal) {
        Account a = new Account(accNo, bal);
        c.addAccount(a);
        if (!customers.contains(c)) customers.add(c);
        System.out.println("Account opened for " + c);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("City Bank");
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 101, 5000);
        bank.openAccount(c1, 102, 12000);
        bank.openAccount(c2, 103, 8000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

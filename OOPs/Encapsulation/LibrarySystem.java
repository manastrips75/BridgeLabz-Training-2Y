interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId, title, author;
    private boolean isReserved;
    private String borrowerName;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    protected void setBorrower(String name) { this.borrowerName = name; }
    protected String getBorrower() { return borrowerName; }

    protected void setReserved(boolean reserved) { this.isReserved = reserved; }
    protected boolean isReserved() { return isReserved; }
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 14; }
    public void reserveItem(String borrower) {
        if (!isReserved()) { setReserved(true); setBorrower(borrower); System.out.println("Book reserved for " + borrower); }
        else System.out.println("Book already reserved.");
    }
    public boolean checkAvailability() { return !isReserved(); }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 7; }
    public void reserveItem(String borrower) {
        if (!isReserved()) { setReserved(true); setBorrower(borrower); System.out.println("Magazine reserved for " + borrower); }
        else System.out.println("Magazine already reserved.");
    }
    public boolean checkAvailability() { return !isReserved(); }
}

class DVD extends LibraryItem {
    public DVD(String id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 5; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B101", "The Alchemist", "Paulo Coelho"),
            new Magazine("M202", "Tech Monthly", "Various"),
            new DVD("D303", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Alice");
            }
            System.out.println();
        }
    }
}

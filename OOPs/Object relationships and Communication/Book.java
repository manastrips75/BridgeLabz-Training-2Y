import java.util.*;

class Book {
    private String title, author;
    public Book(String title, String author) {
        this.title = title; this.author = author;
    }
    public void show() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books = new ArrayList<>();
    public Library(String name) { this.name = name; }
    public void addBook(Book b) { books.add(b); }
    public void showBooks() {
        System.out.println("\n" + name + " contains:");
        for (Book b : books) b.show();
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Atomic Habits", "James Clear");

        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        l1.addBook(b1); l1.addBook(b2);
        l2.addBook(b2); l2.addBook(b3);

        l1.showBooks(); l2.showBooks();
    }
}

class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo() {
        System.out.println("Book: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name, bio;
    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + "\nBio: " + bio);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Author a = new Author("The Silent Library", 2023, "Emma Clark",
                              "British novelist known for mystery thrillers.");
        a.displayInfo();
    }
}

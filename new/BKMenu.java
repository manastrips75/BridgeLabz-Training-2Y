import java.util.Scanner;

public class BKMenu {
     public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int choice;

           switch(choice) {
               case 1 -> System.out.println("Pizza");
               case 2 -> System.out.println("Burger");
               case 3 -> System.out.println("Pasta");
               case 4 -> System.out.println("Drinks");
               default -> System.out.println("Invalid choice");
            }
}}
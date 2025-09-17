import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks <0 || marks > 100) {
            System.out.println("invalid grade.");
        } else if(marks >= 50) {
            System.out.println("You passed!");
        }else{
            System.out.println("You failed!");
        }

        input.close();
    }
}
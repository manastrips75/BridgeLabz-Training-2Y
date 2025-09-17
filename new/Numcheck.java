import java.util.*;

public class Numcheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int[] arr = new int[5];
        
       
        System.out.println("Enter 5 num:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print("Number " + num + " is ");
            
            if (num > 0) {
                
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];
        
        System.out.print("Comparison of first and last: ");
        if (first == last) {
            System.out.println("First and Last are Equal");
        } else if (first > last) {
            System.out.println("First is Greater than Last");
        } else {
            System.out.println("First is Less than Last");
        }
        
        sc.close();
    }
}
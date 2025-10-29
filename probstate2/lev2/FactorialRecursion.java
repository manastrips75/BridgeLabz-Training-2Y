import java.util.*;
public class FactorialRecursion {
    static int getInput(Scanner sc) {
        return sc.nextInt();
    }

    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    static void displayResult(long result) {
        System.out.println("Factorial: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInput(sc);
        displayResult(factorial(n));
    }
}

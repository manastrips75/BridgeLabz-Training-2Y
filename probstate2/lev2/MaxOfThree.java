import java.util.*;
public class MaxOfThree {
    static int getInput(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static int findMax(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = getInput(sc, "Enter first number: ");
        int b = getInput(sc, "Enter second number: ");
        int c = getInput(sc, "Enter third number: ");
        System.out.println("Maximum number: " + findMax(a, b, c));
    }
}

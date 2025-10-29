import java.util.*;
public class PalindromeChecker {
    static String getInput(Scanner sc) {
        return sc.nextLine().replaceAll("\\s+", "").toLowerCase();
    }

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        return s.equals(rev);
    }

    static void displayResult(boolean result) {
        System.out.println(result ? "Palindrome" : "Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = getInput(sc);
        displayResult(isPalindrome(s));
    }
}

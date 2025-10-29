import java.util.*;
public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        String res = "";
        for (char c : s.toCharArray()) if (c != ch) res += c;
        System.out.println("Modified String: " + res);
    }
}

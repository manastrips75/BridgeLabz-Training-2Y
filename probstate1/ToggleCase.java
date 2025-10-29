import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        for (char ch : s.toCharArray())
            res += Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        System.out.println(res);
    }
}

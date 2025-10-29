import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        for (char ch : s.toCharArray())
            if (res.indexOf(ch) == -1) res += ch;
        System.out.println(res);
    }
}

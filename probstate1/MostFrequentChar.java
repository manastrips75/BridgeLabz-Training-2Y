import java.util.*;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (char ch : s.toCharArray()) freq[ch]++;
        int max = 0; char res = ' ';
        for (char ch : s.toCharArray())
            if (freq[ch] > max) { max = freq[ch]; res = ch; }
        System.out.println("Most Frequent Character: '" + res + "'");
    }
}

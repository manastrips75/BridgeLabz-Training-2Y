import java.util.*;
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String res = "";
        for (String w : sentence.split(" ")) 
            res += (w.equals(oldWord) ? newWord : w) + " ";
        System.out.println(res.trim());
    }
}

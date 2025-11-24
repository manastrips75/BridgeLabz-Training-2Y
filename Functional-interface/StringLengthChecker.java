import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthCalc = s -> s.length();

        String msg = "Hello World";
        int len = lengthCalc.apply(msg);

        System.out.println("Length: " + len);
    }
}

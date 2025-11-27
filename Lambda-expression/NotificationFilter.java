import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("High BP", "Normal", "Critical Sugar", "Reminder");
        Predicate<String> filter = a -> a.contains("High") || a.contains("Critical");

        alerts.stream().filter(filter).forEach(System.out::println);
    }
}

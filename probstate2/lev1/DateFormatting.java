import java.time.*;
import java.time.format.*;
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}

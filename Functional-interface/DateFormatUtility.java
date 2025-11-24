import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(DateUtils.format(d, "dd-MM-yyyy"));
    }
}

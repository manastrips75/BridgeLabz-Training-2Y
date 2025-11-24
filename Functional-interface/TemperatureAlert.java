import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = t -> t > 40.0;

        double temp = 45.5;
        if (isHighTemp.test(temp)) {
            System.out.println("Alert: High Temperature");
        } else {
            System.out.println("Temperature Normal");
        }
    }
}

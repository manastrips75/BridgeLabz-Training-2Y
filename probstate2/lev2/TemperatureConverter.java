import java.util.*;
public class TemperatureConverter {
    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        if (choice == 1) System.out.println("Celsius: " + toCelsius(temp));
        else if (choice == 2) System.out.println("Fahrenheit: " + toFahrenheit(temp));
        else System.out.println("Invalid choice");
    }
}

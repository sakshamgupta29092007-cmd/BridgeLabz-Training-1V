import java.util.*;

public class TempConverter {
    static double toCelsius(double f) { return (f - 32) * 5/9; }
    static double toFahrenheit(double c) { return (c * 9/5) + 32; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Celsius: ");
        double c = sc.nextDouble();
        System.out.println("Fahrenheit: " + toFahrenheit(c));
        System.out.print("Enter temp in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println("Celsius: " + toCelsius(f));
    }
}
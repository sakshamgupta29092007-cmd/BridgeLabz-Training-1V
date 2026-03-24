import java.time.LocalDate;

public class DateArithmeticExample {
    public static void main(String[] args) {
        // Example input date
        LocalDate date = LocalDate.of(2026, 3, 24);

        // Add 7 days, 1 month, and 2 years
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        result = result.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Final Result: " + result);
    }
}
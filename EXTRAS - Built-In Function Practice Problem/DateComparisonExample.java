import java.time.LocalDate;

public class DateComparisonExample {
    public static void main(String[] args) {
        // Example input dates
        LocalDate date1 = LocalDate.of(2026, 3, 24);
        LocalDate date2 = LocalDate.of(2026, 5, 10);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
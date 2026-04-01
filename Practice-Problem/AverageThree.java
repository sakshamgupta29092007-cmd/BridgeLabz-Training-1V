import java.util.Scanner;

public class AverageThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println("Average = " + avg);
    }
}
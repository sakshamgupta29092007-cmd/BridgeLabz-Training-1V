import java.util.*;

public class Calculator {
    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static double div(int a, int b) { return (double)a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose operation (+,-,*,/): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        switch(op) {
            case '+': System.out.println("Result: " + add(a,b)); break;
            case '-': System.out.println("Result: " + sub(a,b)); break;
            case '*': System.out.println("Result: " + mul(a,b)); break;
            case '/': System.out.println("Result: " + div(a,b)); break;
            default: System.out.println("Invalid operation");
        }
    }
}
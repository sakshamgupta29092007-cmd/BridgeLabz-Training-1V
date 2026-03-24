import java.util.*;

public class NumberGuessingGame {
    static int generateGuess() {
        return new Random().nextInt(100) + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String feedback = "";
        int guess;
        do {
            guess = generateGuess();
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high/low/correct): ");
            feedback = sc.next();
        } while (!feedback.equalsIgnoreCase("correct"));
        System.out.println("Computer guessed correctly!");
    }
}
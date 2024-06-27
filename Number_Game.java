import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int generatedNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("I've picked a number between " + MIN_RANGE + " and " + MAX_RANGE + ". Try to guess it!");

            while (!guessedCorrectly && attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
                    score++;
                    guessedCorrectly = true;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + generatedNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();

            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Your final score is: " + score);
        System.out.println("Thanks for playing!");
    }
}

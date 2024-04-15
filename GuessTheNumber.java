import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100 (inclusive)
        int secretNumber = random.nextInt(100) + 1;

        int guessCount = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess;
            try {
                guess = scanner.nextInt();
                guessCount++;

                if (guess == secretNumber) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number in " + guessCount + " tries.");
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again and win.");
                } else {
                    System.out.println("Your guess is too high. Try again and win.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear the scanner buffer after invalid input
            }
        }

        scanner.close();
    }
}

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a random number between 0 and 99
        int randomNumber = random.nextInt(100);
        
        // Initialize variables
        int attemptsRemaining = 5;
        int attemptsMade = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Game");
        System.out.println("You have 5 attempts to guess the number between 0 and 99.");
        
        while (attemptsMade < 5) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attemptsMade++;
            
            if (userGuess > randomNumber) {
                System.out.println("Too high! Think of a smaller number.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Think of a larger number.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                hasGuessedCorrectly = true;
                break;
            }
            
            attemptsRemaining--;
            System.out.println("Attempts remaining: " + attemptsRemaining);
        }
        
        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you did not guess the number. The correct number was: " + randomNumber);
        }
        
        scanner.close();
    }
}

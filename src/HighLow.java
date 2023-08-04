import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(100) + 1; //random number between 1 and 100//

        System.out.println("Welcome to the High-Low guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int guess = -1; // initialize guess to an invalid value

        while (guess != number) {
            System.out.print("Enter your guess: ");
            if (input.hasNextInt()) {
                guess = input.nextInt();
                if (guess < 1 || guess > 100) {
                    System.out.println("Your guess must be between 1 and 100.");
                } else if (guess < number) {
                    System.out.println("HIGHER");
                } else if (guess > number) {
                    System.out.println("LOWER");
                } else {
                    System.out.println("GOOD GUESS!");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
                input.nextLine(); // consume the invalid input
            }
        }
        input.close();
    }
}
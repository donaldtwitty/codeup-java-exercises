package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] categories = {"comedy", "drama", "horror", "scifi"};

        int userInput;
        do {
            System.out.println("What would you like to do?");
            System.out.println("\n0 - exit\n1 - view all movies");
            for (int i = 0; i < categories.length; i++) {
                System.out.printf("%d - view movies in the %s category%n", i + 2, categories[i]);
            }

            System.out.print("\nEnter your choice: ");
            userInput = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (userInput == 0) { // exit
                System.out.println("\nGoodbye!");
            } else if (userInput == 1) { // view all movies
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            } else if (userInput >= 2 && userInput <= categories.length + 1) { // view movies by category
                String category = categories[userInput - 2];
                for (Movie movie : MoviesArray.findAll()) {
                    if (movie.getCategory().equalsIgnoreCase(category)) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            } else { // invalid input
                System.out.println("\nInvalid input. Please try again.");
            }

            System.out.println(); // add a new line for formatting
        } while (userInput != 0);
    }
}

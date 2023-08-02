import java.util.Scanner;

public class MethodsExercise {

    // Number 1 //
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static double division(double num1, double num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        return num1 / num2;
//    }

//    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 5;
//
//        System.out.println("Addition: " + addition(num1, num2));
//        System.out.println("Subtraction: " + subtraction(num1, num2));
//        System.out.println("Multiplication: " + multiplication(num1, num2));
//        System.out.println("Division: " + division(num1, num2));
//    }
//}
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }
//
//    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 3;
//
//        System.out.println("Addition: " + addition(num1, num2));
//        System.out.println("Subtraction: " + subtraction(num1, num2));
//        System.out.println("Multiplication: " + multiplication(num1, num2));
//        System.out.println("Division: " + division(num1, num2));
//        System.out.println("Modulus: " + modulus(num1, num2));

    // Test division by zero //
//         System.out.println("Division: " + division(num1, 0));


    // Using loop: //
//        public static int multiplicationWithoutOperator(int num1, int num2) {
//            int result = 0;
//            for(int i = 0; i < num2; i++) {
//                result += num1;
//            }
//            return result;
//        }

    // Using recursion: //

    //        public static int multiplicationWithRecursion(int num1, int num2) {
//            if(num2 == 0) {
//                return 0;
//            }
//            return num1 + multiplicationWithRecursion(num1, num2-1);
//        }
//
//        public static void main(String[] args) {
//            int num1 = 5;
//            int num2 = 3;
//
//            System.out.println("Multiplication with * operator: " + multiplication(num1, num2));
//            System.out.println("Multiplication without * operator: " + multiplicationWithoutOperator(num1, num2));
//            System.out.println("Multiplication with recursion: " + multiplicationWithRecursion(num1, num2));
//        }
//    }
    // Number 2 //
//    public static int getInteger(int min, int max) {
//    Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter a number between %d and %d: ", min, max);
//        int input = scanner.nextInt();
//
//        if (input < min || input > max) {
//            System.out.println("Invalid input. Please try again.");
//            input = getInteger(min, max); // recursive call until valid input is received
//        }
//
//        return input;
//    }
//
//    public static void main(String[] args) {
//        int userInput = getInteger(1, 10);
//        System.out.printf("You entered %d.%n", userInput);

    // Number 3 //
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean continueProgram = true;
//
//        while (continueProgram) {
//
//            int userInput;
//            do {
//                System.out.print("Enter an integer from 1 to 10: ");
//                userInput = scanner.nextInt();
//            } while (userInput < 1 || userInput > 10);
//
//            long factorial = 1;
//            for (int i = 1; i <= userInput; i++) {
//                factorial *= i;
//            }
//
//            System.out.printf("%d! = %d%n", userInput, factorial);
//
//            System.out.print("Do you want to continue? (y/n): ");
//            String continueChoice = scanner.next();
//            continueProgram = continueChoice.equalsIgnoreCase("y");
//        }
//    }

    // Number 4 //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSides;
        do {
            System.out.print("Enter the number of sides for the dice: ");
            numSides = scanner.nextInt();
            if (numSides <= 0) {
                System.out.println("Invalid number of sides. Try again.");
            }
        } while (numSides <= 0);

        boolean rollAgain = true;
        while (rollAgain) {
            int roll1 = rollDie(numSides);
            int roll2 = rollDie(numSides);
            System.out.printf("You rolled a %d and a %d.%n", roll1, roll2);

            System.out.print("Do you want to roll the dice again? (y/n)");
            String answer = scanner.next();
            rollAgain = answer.equalsIgnoreCase("y");
        }
    }

    private static int rollDie(int numSides) {
        return (int) (Math.random() * numSides) + 1;
    }
}





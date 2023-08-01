import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        // Loop Basics //
        // While loop //
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//
//        System.out.println("\n");

//        // Do-while loop - counting by 2's //
//        int j = 0;
//        do {
//            System.out.println(j);
//            j += 2;
//        } while (j <= 100);
//
//        System.out.println("\n");

//        // Do-while loop - counting backwards by 5's //
//        int k = 100;
//        do {
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);
//
//        System.out.println("\n");

//        // Do-while loop - squared values //
//        long l = 2;
//        do {
//            System.out.println(l);
//            l *= l;
//        } while (l < 1000000);
//
//        System.out.println("\n");

//        // For loop - counting by 2's //
//        for (int m = 0; m <= 100; m += 2) {
//            System.out.println(m);
//        }
//
//        System.out.println("\n");

//        // For loop - counting backwards by 5's //
//        for (int n = 100; n >= -10; n -= 5) {
//            System.out.println(n);
//        }
//
//        System.out.println("\n");

//        // For loop - squared values //
//        for (long o = 2; o < 1000000; o *= o) {
//            System.out.println(o);

//        // Fizzbuzz //
//            for (int i = 1; i <= 100; i++) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }

        // Table of Powers //
        Scanner scanner = new Scanner(System.in);
//        char response;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int n = scanner.nextInt();
//
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= n; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %d%n", i, squared, cubed);
//            }
//
//            System.out.print("\nDo you want to continue? (y/n) ");
//            response = scanner.next().charAt(0);
//        } while (Character.toLowerCase(response) == 'y');
//
//        scanner.close();
//      // Convert grades from numbers to letters //
        char choice;

        do {
            System.out.print("Numerical grade from 0 to 100: ");
            int grade = scanner.nextInt();

            if (grade >= 97) {
                System.out.println("Your grade is: A+");
            } else if (grade >= 93 && grade <= 96) {
                System.out.println("Your grade is: A");
            } else if (grade >= 90 && grade <= 92) {
                System.out.println("Your grade is: A-");
            } else if (grade >= 87 && grade <= 89) {
                System.out.println("Your grade is: B+");
            } else if (grade >= 83 && grade <= 86) {
                System.out.println("Your grade is: B");
            } else if (grade >= 80 && grade <= 82) {
                System.out.println("Your grade is: B-");
            } else if (grade >= 77 && grade <= 79) {
                System.out.println("Your grade is: C+");
            } else if (grade >= 73 && grade <= 76) {
                System.out.println("Your grade is: C");
            } else if (grade >= 70 && grade <= 72) {
                System.out.println("Your grade is: C-");
            } else if (grade >= 67 && grade <= 69) {
                System.out.println("Your grade is: D+");
            } else if (grade >= 63 && grade <= 66) {
                System.out.println("Your grade is: D");
            } else if (grade >= 60 && grade <= 62) {
                System.out.println("Your grade is: D-");
            } else {
                System.out.println("Your grade is: F");
            }

            System.out.print("Do you wish to continue? (Y/N) ");
            choice = scanner.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        scanner.close();
    }
}

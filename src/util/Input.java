package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) { //string prompt is bonus//
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) { //string prompt is bonus//
        System.out.print(prompt);
        String input = scanner.nextLine().toLowerCase();
        return (input.equals("y") || input.equals("yes"));
    }

    public int getInt(int min, int max) {
        int num = getInt();
        while (num < min || num > max) {
            System.out.printf("Enter an integer between %d and %d:", min, max);
            num = getInt();
        }
        return num;
    }

    public int getInt() {
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); //discards invalid input
            System.out.print("Invalid input. Enter an integer:");
        }
        int num = scanner.nextInt();
        scanner.nextLine(); //discards newline character
        return num;
    }

    public double getDouble(double min, double max) {
        double num = getDouble();
        while (num < min || num > max) {
            System.out.printf("Enter a decimal number between %.2f and %.2f:", min, max);
            num = getDouble();
        }
        return num;
    }

    public double getDouble() {
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Invalid input. Enter a decimal number:");
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

}

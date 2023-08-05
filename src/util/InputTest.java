package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        String name = input.getString("Enter your name: ");

        System.out.print("Enter a string: ");
        String str = input.getString("Enter your answer: "); //prompt is bonus//
        System.out.println("You entered: " + str);

        System.out.print("Enter yes or no: ");
        boolean answer = input.yesNo("Enter your response: "); //prompt is bonus//
        System.out.println("You answered: " + answer);

        System.out.print("Enter an integer between 10 and 20: ");
        int num1 = input.getInt(10, 20);
        System.out.println("You entered: " + num1);

        System.out.print("Enter an integer: ");
        int num2 = input.getInt();
        System.out.println("You entered: " + num2);

        System.out.print("Enter a decimal number between 1.0 and 2.0: ");
        double num3 = input.getDouble(1.0, 2.0);
        System.out.println("You entered: " + num3);

        System.out.print("Enter a decimal number: ");
        double num4 = input.getDouble();
        System.out.println("You entered: " + num4);
    }
}

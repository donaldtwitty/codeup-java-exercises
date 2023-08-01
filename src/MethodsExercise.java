public class MethodsExercise {
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

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
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));
        System.out.println("Division: " + division(num1, num2));
        System.out.println("Modulus: " + modulus(num1, num2));

        // Test division by zero
         System.out.println("Division: " + division(num1, 0));
    }
}

// TODO: Create a new class called MethodPractice and add main method to test these methods...
public class MethodPractice {
//    public static void main(String[] args) {
//    }

    // TODO: Write a method, returnName, that returns the string of your name.
//    public static String returnName() {
//        return "Donald";
//    }
//        public static void main (String[]args){
//            String name = returnName();
//            System.out.println(name);
// TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings. //

//    public static String returnLongerString(String str1, String str2) {
//        if (str1.length() >= str2.length()) {
//            return str1;
//        } else {
//            return str2;
//        }
//    }
//    public static void main(String[] args) {
//        String longerString = returnLongerString("puppies", "Donald");
//        System.out.println(longerString);
//    }

// TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.

    public static boolean canBeHalved(int integer) {
        boolean intIsEven = integer % 2 == 0;
        return integer % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(canBeHalved(10));
    }
}



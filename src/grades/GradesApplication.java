package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();

        Student bob = new Student("Bob", new int[]{85, 90, 95});
        students.put("bobStone123", bob);

        Student luke = new Student("Luke", new int[]{75, 80, 85});
        students.put("lukeJones456", luke);

        Student tim = new Student("Tim", new int[]{70, 75, 80});
        students.put("timEasel789", tim);

        Student alice = new Student("Alice", new int[]{90, 95, 100});
        students.put("aliceJohnson012", alice);
    }
}

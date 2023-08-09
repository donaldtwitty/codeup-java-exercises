package grades;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student bob = new Student("Bob", new int[]{85, 90, 95});
        bob.recordAttendance("2022-10-01", "P");
        bob.recordAttendance("2022-10-02", "A");
        bob.recordAttendance("2022-10-03", "A");
        students.put("bobStone123", bob);

        Student luke = new Student("Luke", new int[]{75, 80, 85});
        luke.recordAttendance("2022-10-01", "A");
        luke.recordAttendance("2022-10-02", "A");
        luke.recordAttendance("2022-10-03", "A");
        students.put("lukeJones456", luke);

        Student tim = new Student("Tim", new int[]{70, 75, 80});
        tim.recordAttendance("2022-10-01", "P");
        tim.recordAttendance("2022-10-02", "A");
        tim.recordAttendance("2022-10-03", "P");
        students.put("timEasel789", tim);

        Student alice = new Student("Alice", new int[]{90, 95, 100});
        alice.recordAttendance("2022-10-01", "P");
        alice.recordAttendance("2022-10-02", "P");
        alice.recordAttendance("2022-10-03", "P");
        students.put("aliceJohnson012", alice);

        System.out.println("Welcome!\n");

        boolean running = true;
        while (running) {
            System.out.println("Here are the GitHub usernames of our students:\n");
            for (String username : students.keySet()) {
                System.out.print("|" + username + "| ");
            }
            System.out.println("\n");

            System.out.print("What student would you like to see more information on? ");
            String inputUsername = scanner.nextLine();

            if (!students.containsKey(inputUsername)) {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + inputUsername + "\".\n");

                System.out.print("Would you like to see another student? (y/n) ");
                String inputContinue = scanner.nextLine().toLowerCase();
                if (!inputContinue.equals("y")) {
                    running = false;
                }
                continue;
            }

            Student student = students.get(inputUsername);
            System.out.println("\nName: " + student.getName() + " - GitHub Username: " + inputUsername);

            int[] grades = student.getGrades();
            System.out.print("Grades: ");
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
            System.out.println("\nCurrent Average: " + student.getGradeAverage());

            System.out.println("Attendance: " + student.getAttendancePercentage() + "%");
            List<String> absences = student.getAbsenceDates();
            if (!absences.isEmpty()) {
                System.out.println("Absent Dates:");
                for (String date : absences) {
                    System.out.println(date);
                }
            }

            System.out.print("Would you like to see another student? (y/n) ");
            String inputContinue = scanner.nextLine();
            if (!inputContinue.equals("y")) {
                running = false;
            }
        }

        System.out.println("\nGoodbye, and have a wonderful day!");
        scanner.close();
    }
}
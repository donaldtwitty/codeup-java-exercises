package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Bob", new int[] { 85, 90, 95 });
        Student student2 = new Student("Luke", new int[] { 75, 80, 85 });

        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Grade Average: " + student1.getGradeAverage());

        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 Grade Average: " + student2.getGradeAverage());
    }
}

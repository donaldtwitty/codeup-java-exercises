package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Bob");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);

        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Grade Average: " + student1.getGradeAverage());

        Student student2 = new Student("Luke");
        student2.addGrade(75);
        student2.addGrade(80);
        student2.addGrade(85);

        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 Grade Average: " + student2.getGradeAverage());
    }
}

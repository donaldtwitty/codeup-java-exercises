package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private int[] grades;
    private Map<String, String> attendance;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
        this.attendance = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public void addGrade(int grade) {
        int[] newGrades = new int[grades.length + 1];
        System.arraycopy(grades, 0, newGrades, 0, grades.length);

        newGrades[newGrades.length - 1] = grade;
        grades = newGrades;
    }

    public void recordAttendance(String date, String value) {
        if (value.equals("A") || value.equals("P")) {
            attendance.put(date, value);
        }
    }

    public double getAttendancePercentage() {
        int totalDays = attendance.size();
        int absences = 0;
        for (String value : attendance.values()) {
            if (value.equals("A")) {
                absences++;
            }
        }

        return (double) (totalDays - absences) / totalDays * 100;
    }

    public List<String> getAbsenceDates() {
        List<String> absences = new ArrayList<>();
        for (Map.Entry<String, String> entry : attendance.entrySet()) {
            if (entry.getValue().equals("A")) {
                absences.add(entry.getKey());
            }
        }
        return absences;
    }
}

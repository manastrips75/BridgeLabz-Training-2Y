import java.util.*;

class Subject {
    String name;
    double marks;
    Subject(String name, double marks) {
        this.name = name; this.marks = marks;
    }
}

class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();
    Student(String name) { this.name = name; }
    void addSubject(Subject s) { subjects.add(s); }
    List<Subject> getSubjects() { return subjects; }
}

class GradeCalculator {
    String calculateGrade(Student s) {
        double total = 0;
        for (Subject sub : s.getSubjects()) total += sub.marks;
        double avg = total / s.getSubjects().size();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else return "C";
    }
}

public class SchoolResultApp {
    public static void main(String[] args) {
        Student st = new Student("John");
        st.addSubject(new Subject("Maths", 90));
        st.addSubject(new Subject("Science", 85));

        GradeCalculator gc = new GradeCalculator();
        System.out.println(st.name + "'s Grade: " + gc.calculateGrade(st));
    }
}

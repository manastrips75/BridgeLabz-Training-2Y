import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public String getName() { return name; }
    public void addStudent(Student s) { students.add(s); }
    public void showStudents() {
        System.out.println("\nCourse: " + name + " | Enrolled Students:");
        for (Student s : students) System.out.println(s.getName());
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public String getName() { return name; }
    public void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    public void showCourses() {
        System.out.println("\nStudent: " + name + " | Enrolled Courses:");
        for (Course c : courses) System.out.println(c.getName());
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    public School(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
    public void showStudents() {
        System.out.println("\nSchool: " + name + " | Students:");
        for (Student s : students) System.out.println(s.getName());
    }
}

public class AssociationAggregationDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        c1.showStudents();
        c2.showStudents();
    }
}

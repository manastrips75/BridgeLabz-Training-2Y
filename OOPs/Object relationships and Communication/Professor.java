import java.util.*;

class Professor {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
    public void assignCourse(Course c) {
        courses.add(c);
        c.setProfessor(this);
        System.out.println(name + " assigned to teach " + c.getName());
    }
    public void showCourses() {
        System.out.println("\nProfessor: " + name + " | Courses:");
        for (Course c : courses) System.out.println(c.getName());
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public String getName() { return name; }
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.getName());
    }
    public void showCourses() {
        System.out.println("\nStudent: " + name + " | Enrolled Courses:");
        for (Course c : courses) System.out.println(c.getName());
    }
}

class Course {
    private String name;
    private Professor professor;
    private List<Student> students = new ArrayList<>();
    public Course(String name) { this.name = name; }
    public String getName() { return name; }
    public void setProfessor(Professor p) { this.professor = p; }
    public void addStudent(Student s) { students.add(s); }
    public void showDetails() {
        System.out.println("\nCourse: " + name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Students:");
        for (Student s : students) System.out.println(s.getName());
    }
}

class University {
    private String name;
    private List<Student> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    public University(String name) { this.name = name; }
    public void addStudent(Student s) { students.add(s); }
    public void addProfessor(Professor p) { professors.add(p); }
    public void addCourse(Course c) { courses.add(c); }
    public void showUniversity() {
        System.out.println("\nUniversity: " + name);
        System.out.println("Students:");
        for (Student s : students) System.out.println(s.getName());
        System.out.println("Professors:");
        for (Professor p : professors) System.out.println(p.getName());
        System.out.println("Courses:");
        for (Course c : courses) System.out.println(c.getName());
    }
}

public class UniversityManagementDemo {
    public static void main(String[] args) {
        University u = new University("Tech University");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        u.addStudent(s1);
        u.addStudent(s2);
        u.addProfessor(p1);
        u.addProfessor(p2);
        u.addCourse(c1);
        u.addCourse(c2);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        u.showUniversity();
        p1.showCourses();
        s2.showCourses();
        c1.showDetails();
        c2.showDetails();
    }
}

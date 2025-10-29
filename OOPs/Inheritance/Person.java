class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayRole() {
        System.out.println("This is a person.");
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayRole() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

class Student extends Person {
    String grade;
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println("Student: " + name + ", Grade: " + grade);
    }
}

class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void displayRole() {
        System.out.println("Staff: " + name + ", Department: " + department);
    }
}

public class SchoolSystemApp {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Aarav", 15, "10th");
        Staff st = new Staff("Mrs. Kapoor", 35, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}

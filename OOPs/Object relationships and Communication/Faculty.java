import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String name;
    public Department(String name) { this.name = name; }
    public void show() { System.out.println("Department: " + name); }
}

class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();
    public University(String name) { this.name = name; }
    public void addDepartment(Department d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }
    public void showUniversity() {
        System.out.println("\nUniversity: " + name);
        System.out.println("Departments:");
        for (Department d : departments) d.show();
        System.out.println("Faculties:");
        for (Faculty f : faculties) System.out.println(f.getName());
    }
    public void closeUniversity() {
        departments.clear();
        System.out.println("\nUniversity " + name + " closed. All departments deleted.");
    }
}

public class CompositionAggregationDemo {
    public static void main(String[] args) {
        University u = new University("Global University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        u.addDepartment(d1);
        u.addDepartment(d2);

        u.addFaculty(f1);
        u.addFaculty(f2);

        u.showUniversity();
        u.closeUniversity();

        System.out.println("\nFaculties still exist independently:");
        System.out.println(f1.getName());
        System.out.println(f2.getName());
    }
}

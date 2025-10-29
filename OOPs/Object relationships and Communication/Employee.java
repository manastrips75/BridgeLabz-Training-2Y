import java.util.*;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public void show() { System.out.println("Employee: " + name); }
}

class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();
    public Department(String name) { this.name = name; }
    public void addEmployee(String n) { employees.add(new Employee(n)); }
    public void show() {
        System.out.println("Department: " + name);
        for (Employee e : employees) e.show();
    }
}

class Company {
    private String name;
    private List<Department> depts = new ArrayList<>();
    public Company(String name) { this.name = name; }
    public void addDepartment(Department d) { depts.add(d); }
    public void showCompany() {
        System.out.println("\nCompany: " + name);
        for (Department d : depts) d.show();
    }
    public void closeCompany() {
        depts.clear();
        System.out.println("\nCompany " + name + " and all departments are deleted.");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("HR");
        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        Department d2 = new Department("IT");
        d2.addEmployee("Charlie");
        d2.addEmployee("David");

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.showCompany();
        c.closeCompany();
    }
}

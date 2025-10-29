// Interface for Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract Class for Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    // Abstract method
    public abstract double calculateSalary();
}

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {
    private double monthlyBonus;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlyBonus) {
        super(employeeId, name, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyBonus;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 40000, 5000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 10000, 60, 200);

        ((FullTimeEmployee) e1).assignDepartment("HR");
        ((PartTimeEmployee) e2).assignDepartment("IT Support");

        Employee[] employees = { e1, e2 };

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }

            System.out.println("-----------------------------");
        }
    }
}

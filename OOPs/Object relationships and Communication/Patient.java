import java.util.*;

class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
    public void addDoctor(Doctor d) { doctors.add(d); }
    public void showDoctors() {
        System.out.println("\nPatient: " + name + " | Consulted Doctors:");
        for (Doctor d : doctors) System.out.println(d.getName());
    }
}

class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();
    public Doctor(String name) { this.name = name; }
    public String getName() { return name; }
    public void consult(Patient p) {
        patients.add(p);
        p.addDoctor(this);
        System.out.println("Dr. " + name + " consulted patient " + p.getName());
    }
    public void showPatients() {
        System.out.println("\nDoctor: " + name + " | Patients:");
        for (Patient p : patients) System.out.println(p.getName());
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    public Hospital(String name) { this.name = name; }
    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }
    public void showHospital() {
        System.out.println("\nHospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) System.out.println(d.getName());
        System.out.println("Patients:");
        for (Patient p : patients) System.out.println(p.getName());
    }
}

public class AssociationCommunicationDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Johnson");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        h.addDoctor(d1);
        h.addDoctor(d2);
        h.addPatient(p1);
        h.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        h.showHospital();
        d1.showPatients();
        d2.showPatients();
        p1.showDoctors();
        p2.showDoctors();
    }
}

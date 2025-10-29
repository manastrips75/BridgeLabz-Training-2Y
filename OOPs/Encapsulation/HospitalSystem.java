interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId, name, diagnosis;
    private int age;

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    protected void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    protected String getDiagnosis() { return diagnosis; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private String medicalHistory = "";

    public InPatient(String id, String name, int age, double rate, int days) {
        super(id, name, age);
        this.dailyRate = rate;
        this.daysAdmitted = days;
    }

    public double calculateBill() { return dailyRate * daysAdmitted; }
    public void addRecord(String record) { medicalHistory += record + "\n"; }
    public void viewRecords() { System.out.println("History:\n" + medicalHistory); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory = "";

    public OutPatient(String id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    public double calculateBill() { return consultationFee; }
    public void addRecord(String record) { medicalHistory += record + "\n"; }
    public void viewRecords() { System.out.println("History:\n" + medicalHistory); }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P101", "Alice", 30, 2000, 3),
            new OutPatient("P202", "Bob", 45, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("Routine check-up complete.");
                m.viewRecords();
            }
            System.out.println("Total Bill: " + p.calculateBill() + "\n");
        }
    }
}

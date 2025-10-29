interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber, type;
    private double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);

    public void displayDetails() {
        System.out.println(type + " [" + vehicleNumber + "] - Rate: " + rentalRate);
    }
}

class Car extends Vehicle implements Insurable {
    private String policyNo = "CAR123";
    public Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return getRentalRate() * 0.10; }
    public String getInsuranceDetails() { return "Car Insurance Policy: " + policyNo; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNo = "BIKE456";
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    public double calculateInsurance() { return getRentalRate() * 0.05; }
    public String getInsuranceDetails() { return "Bike Insurance Policy: " + policyNo; }
}

class Truck extends Vehicle {
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C101", 2000),
            new Bike("B202", 800),
            new Truck("T303", 3000)
        };

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental (5 days): " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance: " + ins.calculateInsurance());
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}

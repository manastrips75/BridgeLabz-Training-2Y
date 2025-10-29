interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId, driverName, currentLocation;
    protected double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: " + ratePerKm);
    }

    protected void setLocation(String location) { this.currentLocation = location; }
    protected String getLocation() { return currentLocation; }
}

class Car extends Vehicle implements GPS {
    public Car(String id, String driver) { super(id, driver, 15.0); }
    public double calculateFare(double distance) { return distance * ratePerKm; }
    public void getCurrentLocation() { System.out.println("Car at: " + getLocation()); }
    public void updateLocation(String newLocation) { setLocation(newLocation); }
}

class Bike extends Vehicle implements GPS {
    public Bike(String id, String driver) { super(id, driver, 8.0); }
    public double calculateFare(double distance) { return distance * ratePerKm; }
    public void getCurrentLocation() { System.out.println("Bike at: " + getLocation()); }
    public void updateLocation(String newLocation) { setLocation(newLocation); }
}

class Auto extends Vehicle implements GPS {
    public Auto(String id, String driver) { super(id, driver, 10.0); }
    public double calculateFare(double distance) { return distance * ratePerKm; }
    public void getCurrentLocation() { System.out.println("Auto at: " + getLocation()); }
    public void updateLocation(String newLocation) { setLocation(newLocation); }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("C101", "Amit"),
            new Bike("B202", "Ravi"),
            new Auto("A303", "Neha")
        };

        double distance = 12.5;
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            if (v instanceof GPS) {
                GPS g = (GPS) v;
                g.updateLocation("Downtown");
                g.getCurrentLocation();
            }
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance) + "\n");
        }
    }
}

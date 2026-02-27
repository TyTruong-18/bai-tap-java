package OOP_Vehicle_Solution;

import java.util.*;

public class Truck extends Vehicle {

    private double capacity;

    public Truck() {
    }

    public Truck(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("capacity: ");
        setCapacity(scanner.nextDouble());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.println("capacity: ");
        setCapacity(scanner.nextDouble());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("capacity: ");
        setCapacity(scanner.nextDouble());
    }
}

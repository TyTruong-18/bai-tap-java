package OOP_Vehicle_Solution;

import java.util.Scanner;

public class Car extends Vehicle {

    Scanner sc = new Scanner(System.in);
    private int numberOfSeats;

    public Car() {
    }

    public Car(String id, String brand, String model, int rentallDays, double rentallPricePerDay) {
        super(id, brand, model, rentallDays, rentallPricePerDay);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        System.out.println("numberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
    }

    @Override
    public void updateVehicle() {
        super.updateVehicle();
        System.out.println("numberOfSeats: ");
        setNumberOfSeats(sc.nextInt());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("numberOfSeats: " + getNumberOfSeats());
    }
}

package OOP_Vehicle_Solution;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {

    private String id;
    private String brand;
    private String model;
    private int rentallDays;
    private double rentallPricePerDay;

    public Vehicle() {
    }

    public Vehicle(String id, String brand, String model, int rentallDays, double rentallPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentallDays = rentallDays;
        this.rentallPricePerDay = rentallPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentallDays() {
        return rentallDays;
    }

    public void setRentallDays(int rentallDays) {
        this.rentallDays = rentallDays;
    }

    public double getRentallPricePerDay() {
        return rentallPricePerDay;
    }

    public void setRentallPricePerDay(double rentallPricePerDay) {
        this.rentallPricePerDay = rentallPricePerDay;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addVehicle() {
        System.out.print("id: ");
        setId(sc.nextLine());
        System.out.print("brand: ");
        setBrand(sc.nextLine());
        System.out.print("model: ");
        setModel(sc.nextLine());
        System.out.print("rentallDays: ");
        setRentallDays(sc.nextInt());
        System.out.print("rentallPricePerDay: ");
        setRentallPricePerDay(sc.nextDouble());
    }

    @Override
    public void updateVehicle() {
        sc.nextLine();
        System.out.print("brand: ");
        setBrand(sc.nextLine());
        System.out.print("rentallDays: ");
        setRentallDays(sc.nextInt());
        System.out.print("rentallPricePerDay: ");
        setRentallPricePerDay(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + getId() + ", brand: " + getBrand() + ", rentallDays: " + getRentallDays() + ",rentallPricePerDay: " + getRentallPricePerDay());
    }

}

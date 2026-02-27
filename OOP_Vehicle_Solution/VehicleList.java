package OOP_Vehicle_Solution;

import java.util.*;

public class VehicleList {

    ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void updateVehicle(String id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.get(i).updateVehicle();
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void deleteVehicleById(String id) {
        if (vehicleList.isEmpty()) {
            System.out.println("0 vehicle");
            return;
        }
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.remove(i);
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void findVehicleById(String id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.get(i).displayDetails();
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void displayAllVehicles() {
        int numberOfCar = 0;
        int numberOfTruck = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle instanceof Car) {
                numberOfCar++;
            } else if (vehicle instanceof Truck) {
                numberOfTruck++;
            }
        }
        System.out.println("Car: " + numberOfCar + "\nTruck" + numberOfTruck);
    }

    void countVehicles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addVehicle(Car c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

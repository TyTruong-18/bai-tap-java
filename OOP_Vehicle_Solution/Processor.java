package OOP_Vehicle_Solution;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleList vehicleList = new VehicleList();
        int next = 1;

        do {
            System.out.println("0. Exit program"
                    + "\n1. Add a vehicle"
                    + "\n2. Update a vehicle"
                    + "\n3. Find vehicle by id"
                    + "\n4. Delete a vehicle"
                    + "\n5. Display all vehicles"
                    + "\n6. Count each vehicle individually");

            int choice = sc.nextInt();

            switch (choice) {

                case 0 ->
                    System.out.println("Exit program");

                case 1 -> {
                    System.out.print("Enter Car(1) / Truck(2): ");
                    switch (sc.nextInt()) {

                        case 1 -> {
                            Car c = new Car();
                            c.addVehicle();
                            vehicleList.addVehicle(c);
                        }

                        case 2 -> {
                            Truck t = new Truck();
                            t.addVehicle();
                            vehicleList.addVehicle(t);
                        }
                    }
                    System.out.println("Success");
                }

                case 2 -> {
                    sc.nextLine();
                    System.out.print("Enter id to update: ");
                    vehicleList.updateVehicle(sc.nextLine());
                }

                case 3 -> {
                    sc.nextLine();
                    System.out.print("Enter id to find: ");
                    vehicleList.findVehicleById(sc.nextLine());
                }

                case 4 -> {
                    sc.nextLine();
                    System.out.print("Enter id to delete: ");
                    vehicleList.deleteVehicleById(sc.nextLine());
                    System.out.println("Success");
                }

                case 5 -> {
                    System.out.println("All vehicles:");
                    vehicleList.displayAllVehicles();
                }

                case 6 ->
                    vehicleList.countVehicles();

                default ->
                    System.out.println("Invalid choice!");
            }

            if (choice == 0) {
                break;
            }

            System.out.println("Continue? 1 yes / 0 no:");
            next = sc.nextInt();

        } while (next != 0);
    }
}

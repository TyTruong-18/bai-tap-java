package OOP_Room_Solution;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();
        int choice;

        do {
            System.out.println("\n1.Meeting  2.Bed  3.Update  4.Delete");
            System.out.println("5.Find  6.Display  7.Count  0.Exit");
            System.out.print("Choose: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1, 2 -> {
                    Room r = (choice == 1) ? new MeetingRoom() : new BedRoom();
                    r.addRoom();
                    list.addRoom(r);
                }
                case 3 -> {
                    System.out.print("ID: ");
                    if (!list.updateRoomById(sc.nextLine())) {
                        System.out.println("Not found!");
                    }
                }
                case 4 -> {
                    System.out.print("ID: ");
                    if (!list.deleteRoomById(sc.nextLine())) {
                        System.out.println("Not found!");
                    }
                }
                case 5 -> {
                    System.out.print("ID: ");
                    Room r = list.findRoomById(sc.nextLine());
                    System.out.println(r == null ? "Not found!" : "");
                    if (r != null) {
                        r.displayDetails();
                    }
                }
                case 6 ->
                    list.displayAllRooms();
                case 7 ->
                    list.countRooms();
                default -> {
                }
            }

        } while (choice != 0);

        System.out.println("Bye!");
    }
}

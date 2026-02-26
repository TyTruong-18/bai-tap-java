package OOP_Room_Solution;

import java.util.*;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.print("capacity:");
        setCapacity(scanner.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("capacity:");
        setCapacity(scanner.nextInt());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.print("capacity:");
        setCapacity(scanner.nextInt());
    }
}

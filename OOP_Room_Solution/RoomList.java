
package OOP_Room_Solution;

import java.util.*;
public class RoomList {
    private ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public boolean updateRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equalsIgnoreCase(id)) {
                r.updateRoom();
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        return roomList.removeIf(r -> r.getId().equalsIgnoreCase(id));
    }

    public Room findRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
    }

    public void displayAllRooms() {
        if (roomList.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            for (Room r : roomList) {
                r.displayDetails();
            }
        }
    }

    public void countRooms() {
        System.out.println("Total rooms: " + roomList.size());
    }
}


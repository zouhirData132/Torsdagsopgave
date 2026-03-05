package Del1;

import java.util.ArrayList;

//Felter: name (String), rooms (ArrayList<Room>)
//Konstruktør: tager name
//Metoder:
//void addRoom(Room room)
//int getTotalLampCount() — total antal lamper i hele bygningen
//int getTotalWatt() — samlet wattal for hele bygningen
//void printBuilding() — printer alle rum med deres lamper og vinduer
public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();

    }

    public void addRoom(Room room) {
        rooms.add(room); // tilføjer værelse
    }

    int getTotalLampCount() { //
        int total = 0;
        for (Room room : rooms) {
            total += room.getLampCount();
        }
        return total;
    }

    int getTotalWatt() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getTotalWatt();
        }
        return total;
    }

    public void printBuilding() {
        System.out.println("Building: " + name);

        System.out.println("Rooom: " + rooms);
        for (Room room : rooms) {
            room.printRoom();
        }

    }
}

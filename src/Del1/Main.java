import Del1.Building;
import Del1.Lamp;
import Del1.Room;
import Del1.Window;

void main() {
    Building b = new Building("Hjem");

    Room room1 = new Room("Stuen");
    room1.addLamp(new Lamp(60));
    room1.addLamp(new Lamp(80));
    room1.addLamp(new Lamp(100));
    room1.addWindow(new Window(100, 80));
    room1.addWindow(new Window(100, 80));

    Room room2 = new Room("Køkken");
    room2.addLamp(new Lamp(50));
    room2.addLamp(new Lamp(50));
    room2.addWindow(new Window(70, 70));

    Room room3 = new Room("Soveværelse");
    room3.addLamp(new Lamp(60));
    room3.addLamp(new Lamp(60));
    room3.addWindow(new Window(90,70));

    b.addRoom(room1);
    b.addRoom(room2);
    b.addRoom(room3);

    b.printBuilding();

}


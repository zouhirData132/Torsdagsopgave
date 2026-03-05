package Del1;

import java.util.ArrayList;

// Felter: name (String), lamps (ArrayList<Lamp>), windows (ArrayList<Window>)
//Konstruktør: tager name
//Metoder:
//void addLamp(Lamp lamp)
//void addWindow(Window window)
//int getLampCount()
//int getTotalWatt() — sum af alle lampernes watt
//int getTotalWindowArea() — sum af alle vinduers areal
//void printRoom()
public class Room {
   String name;
    ArrayList<Lamp>lamps;
    ArrayList<Window>windows;

    public Room(String name){
        this.name = name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp){
    lamps.add(lamp); // tilføje lamper
    }

    public void addWindow(Window window){
    windows.add(window); // tilføje vinduer
    }

    int getLampCount(){
        return lamps.size();
    }

    int getTotalWatt(){ //sum af alle lampernes watt
        int total = 0;
        for (Lamp lamp :  lamps) {
            total += lamp.watt;
        }

        return total;
    }
    int getTotalWindowArea(){ //sum af alle vinduers areal
        int totalArea = 0;
        for (Window window : windows)
            totalArea += window.getAreaCm2();
        return totalArea;
    }
    void printRoom() { //Printning af hvad vi har lavet.
        System.out.println("Room: " + name);

        System.out.println("Lamps: ");
        for (Lamp lamp : lamps) {
            System.out.println(" " + lamp);
        }

        System.out.println("Window");
        for (Window window : windows) {
            System.out.println(" " + window);
        }

    }

    @Override
    public String toString() {
        return name + "(" + lamps.size() + " lamper, " + windows.size() + " vinduer)";
    }
}




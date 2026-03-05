package Del1;
//Felter: watt (int), isOn (boolean)
//Konstruktør: tager watt som parameter, isOn starter som false
//Metoder: void turnOn(), void turnOff(), toString()
public class Lamp {
    int watt;
    boolean isOn;

    public Lamp(int watt){
        this.watt = watt;
        this.isOn = false;
    }


    void turnOn(){
        isOn = true;

    }
    void turnOff(){
    isOn = false;

    }

    @Override
    public String toString() {
        return watt + "W";
    }
}

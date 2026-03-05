package Del1;
//Felter: widthCm (int), heightCm (int)
//Konstruktør: tager bredde og højde
//Metoder: int getAreaCm2(), toString()
public class Window{

    int widthCm;
    int heightCm;

    public Window(int widthCm, int heightCm ){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    int getAreaCm2(){ //udregning af areal.
       int area = widthCm * heightCm;
        return area;
    }

    @Override
    public String toString() {
        return widthCm + "x" + heightCm + "cm";
    }
}

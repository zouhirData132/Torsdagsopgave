package Del2;

public class Rabbit extends Animal {

    Rabbit(String name){
       super(name, 150);
    }

    @Override
    public int attack() {
        return 5;
    }
}

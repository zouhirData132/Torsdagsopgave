package Del2;

import java.util.Random;

public class Wolf extends Animal{
private Random random = new Random();

    Wolf(String name){
        super(name, 100);
    }


    @Override
    public int attack() {
        return random.nextInt(16)+5;
    }
}

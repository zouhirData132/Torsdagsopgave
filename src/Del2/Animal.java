package Del2;
//Byg et system hvor dyr konkurrerer mod hinanden.
// Hvert dyr har et navn og en mængde energi —
// når energien når nul, er dyret ude af konkurrencen.
//
//Superklassen
//Lav en klasse Animal med felterne: name (String), energy (int)
//Lav konstruktør, relevante getters/setters, og en metode boolean isActive() der returnerer true hvis energy er større end 0.
public abstract class Animal {

    String name;
    int energy;

    Animal(String name, int energy){
        this.name = name;
        this.energy = energy;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = Math.max(0, energy);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean isActive() {
        if (energy > 0) {
            return true;
        } else {
            return false;
        }
    }
        //Lav en metode int attack() der returnerer hvor meget energi dyret trækker fra sin modstander.
        // Du bestemmer selv om den skal være abstrakt eller konkret —
        // tænk over hvad der giver mest mening.

        public abstract int attack();

    @Override
    public String toString() {
        return ("name: " + name + "(energy: " + energy + ")");
    }
}







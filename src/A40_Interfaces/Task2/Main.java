package A40_Interfaces.Task2;

import A40_Interfaces.Task2.Interfaces.Animal;
import A40_Interfaces.Task2.Interfaces.Fly;
import A40_Interfaces.Task2.Interfaces.Sail;
import A40_Interfaces.Task2.Animals.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.food();

        Animal duck = new Duck();
        duck.speed();

        Fly duck2 = new Duck();
        duck2.food();

        Animal duck3 = new Duck();
        duck3.food();

        // duck3.deepness();        // Bu calismaz cunki duck3 animal ve animalin deepness() methodu yok ama...
        ((Sail)duck3).deepness();   // Casting yaparak Sail Interface'inin metodu kullnailabilir. Cunki Sail Animal'i implement etti

        // duck3.altitute();        // calismaz cunki duck3 animal ve animalin altitude() methodu da yok
        ((Fly)duck3).altitude(); // Casting yaparak Fly Interface'inin metodu kullnailabilir. Cunki Fly Animal'i implement etti

        duck2.altitude();       // duck2 zaten Fly oldugundan cast gerekmez

    }
}

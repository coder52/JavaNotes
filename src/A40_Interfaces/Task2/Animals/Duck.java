package A40_Interfaces.Task2.Animals;

import A40_Interfaces.Task2.Interfaces.Fly;
import A40_Interfaces.Task2.Interfaces.Sail;

public class Duck implements Fly, Sail {
    @Override
    public void speed() {

    }

    @Override
    public void food() {

    }

    @Override
    public int altitude() {
        return 0;
    }

    @Override
    public double deepness() {
        return 0;
    }
}

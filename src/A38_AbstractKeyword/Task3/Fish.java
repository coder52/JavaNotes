package A38_AbstractKeyword.Task3;

public class Fish extends Animal{
    @Override
    public String noise() {
        return " ";
    }

    @Override
    public String eat() {
        return "plankton";
    }

    @Override
    public double sleep() {
        return 5;
    }
}

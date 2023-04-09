package A38_AbstractKeyword.Task3;

public class Dog extends Animal {
    @Override
    public String noise() {
        return "hav";
    }

    @Override
    public String eat() {
        return "bread";
    }

    @Override
    public double sleep() {
        return 7;
    }
}

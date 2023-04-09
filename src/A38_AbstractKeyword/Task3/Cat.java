package A38_AbstractKeyword.Task3;

public class Cat extends Animal{
    @Override
    public String noise() {
        return "miaow";
    }

    @Override
    public String eat() {
        return "fish";
    }

    @Override
    public double sleep() {
        return 8;
    }
}

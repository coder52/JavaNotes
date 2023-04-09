package A38_AbstractKeyword.Task3;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        System.out.println(cat);

        Animal dog = new Dog();
        System.out.println(dog);

        Animal animal =new Dog();
        System.out.println(animal);

        animal = new Fish();
        System.out.println(animal);

    }
}

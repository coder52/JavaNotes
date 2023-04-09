package A38_AbstractKeyword.Task6;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Miav!");
    }

    public String toString(){
        return super.toString()+
                getClass().getSimpleName()+
                "\n";
    }
}

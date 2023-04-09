package A41_InstanceOf_Default.Task.food;

import A41_InstanceOf_Default.Task.resources.Food;

public class Maklube implements Food {

    public void fry(){
        System.out.println("Fry potato.");
    }

    public void design(){
        System.out.println("Make design.");
    }

    public void boil(){
        System.out.println("Bolil maklube.");
    }



    @Override
    public String taste() {
        return "Sehr good.";
    }
}

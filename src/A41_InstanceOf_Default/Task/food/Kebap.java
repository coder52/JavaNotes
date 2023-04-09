package A41_InstanceOf_Default.Task.food;

import A41_InstanceOf_Default.Task.resources.Food;

public class Kebap implements Food {
    public String marinade(){
        return "oil, salt";
    }

    public void grill(){
        System.out.println("Grill Kebap.");
    }


    @Override
    public String taste() {
        return "spicy";
    }
}

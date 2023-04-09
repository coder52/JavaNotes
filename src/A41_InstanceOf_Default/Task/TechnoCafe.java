package A41_InstanceOf_Default.Task;

import A41_InstanceOf_Default.Task.food.Kebap;
import A41_InstanceOf_Default.Task.food.Maklube;
import A41_InstanceOf_Default.Task.resources.Food;

public class TechnoCafe {

    public static void main(String[] args) {
        Kebap kebap = new Kebap();
        Maklube maklube = new Maklube();

        Kitchen fethisKitchen = new Kitchen();
        fethisKitchen.cook(kebap);
        fethisKitchen.cook(maklube);

        kebap.printed();
        maklube.printed();


    }
}

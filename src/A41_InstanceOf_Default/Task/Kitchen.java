package A41_InstanceOf_Default.Task;

import A41_InstanceOf_Default.Task.food.Besparmak;
import A41_InstanceOf_Default.Task.food.Karniyarik;
import A41_InstanceOf_Default.Task.food.Kebap;
import A41_InstanceOf_Default.Task.food.Maklube;
import A41_InstanceOf_Default.Task.resources.Food;

public class Kitchen {

    public void cook(Food food){

        if(food instanceof Kebap){

            ((Kebap) food).marinade();
            ((Kebap) food).grill();
            System.out.println("Kebap is ready");

        } else if(food instanceof Besparmak){

            Besparmak besparmak = (Besparmak)food;
            besparmak.boil();
            System.out.println("Besparmak is ready");

        } else if (food instanceof Karniyarik){

            Karniyarik karniyarik = (Karniyarik) food;
            karniyarik.fry();
            karniyarik.bake();
            System.out.println("Karniyarik is ready");

        } else if (food instanceof Maklube){

            ((Maklube) food).fry();
            ((Maklube) food).boil();
            ((Maklube) food).design();
            System.out.println("Maklube is ready");
        }

    }
}

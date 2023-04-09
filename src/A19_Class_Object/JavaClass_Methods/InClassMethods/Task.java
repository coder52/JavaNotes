package A19_Class_Object.JavaClass_Methods.InClassMethods;

public class Task {

    public static void main(String[] args) {
        Costumer costumer1 = new Costumer();
        costumer1.name = "Dursun";
        costumer1.Account.consumeElectricity(100.5f);
        costumer1.costumerInfo();

    }
}

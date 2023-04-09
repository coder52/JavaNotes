package A19_Class_Object.JavaClass_Methods.InClassMethods;

public class Costumer {
    String name;
    ElectricityAccount Account = new ElectricityAccount();

    void costumerInfo(){
        System.out.println("Costumer Name :" + this.name);
        this.Account.printAccountInfo();
    }
}

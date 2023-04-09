package A19_Class_Object.JavaClass_Methods.InClassMethods;

public class ElectricityAccount {
    float totalWpH=0;
    float rate = 5.4f;
    float bill=0;

    void printAccountInfo(){
        System.out.println(
                        "Total Consume :" + this.totalWpH +
                        "\nRate : " + this.rate +
                        "\nBill : " + this.bill);
    }

    void consumeElectricity(float newWpH){
        this.totalWpH += newWpH;
        this.calculateBill();
    }

    void calculateBill(){
        this.bill = this.rate*this.totalWpH;
    }


}

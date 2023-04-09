package A39_Polymorphism.RuntimePolimorphismUpcasting;

class Bank{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 9.7f;}
}
class TestPolymorphism{
    public static void main(String args[]){

        Bank b;

        b=new SBI();        //Upcasting
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());

        b=new ICICI();      //Upcasting
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());

        b=new AXIS();       //Upcasting
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());

    }
}

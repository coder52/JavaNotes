package A39_Polymorphism.RuntimePolimorphismUpcasting;

// Data member lar upcasting olmuyor.

class Bike{

    int speedlimit=90;

}

class Honda3 extends Bike {
    int speedlimit = 150;

    public static void main(String args[]) {

        Bike obj1 = new Honda3();
        System.out.println(obj1.speedlimit);     //90  olur 150 olmaz fieldlar upcasting olmaz

        Honda3 obj2 = new Honda3();
        System.out.println(obj2.speedlimit);     //150
    }
}

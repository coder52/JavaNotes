package A40_Interfaces.Task1.interfaces;

//every field and method have public access modifier by default
public interface Electric {
    // in interfaces every field is 'public final static' by default
    // therefor we have to initialize it.
    // Yazsak da yazmasakda olur
//     public final static int batteryLife = 100;
    int batteryLife = 100;

    // There is no constructor in interface
    // Electric(){}

    // every method in interface 'public abstract' by default
    // yazmasak da olur
    // public abstract String changeBattery();
    String changeBattery();

    // interface doesn't allow non-abstract method except static and default methods.
    public static void print(){
        System.out.println("Electric");
    }




}

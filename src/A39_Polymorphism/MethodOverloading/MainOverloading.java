package A39_Polymorphism.MethodOverloading;
// You can have any number of main methods in a class by method overloading.
// But JVM calls main() method which receives string array as arguments only.
public class MainOverloading {

    public static void main(String[] args){     //JVM  compiles just this one
        System.out.println("main with String[]");
    }

    public static void main(String args){
        System.out.println("main with String");
    }

    public static void main(){
        System.out.println("main without args");
    }

}

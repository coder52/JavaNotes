package B03_Generics;

public class GenericClass <T>{
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    T get(){
        return obj;
    }

}

class Main{
    public static void main(String[] args) {
        GenericClass<Integer> myGeneric = new GenericClass<>();
        myGeneric.add(5);
//        myGeneric.add("Maveric"); //Compile time error verecektir.

        System.out.println(myGeneric.get());
    }
}


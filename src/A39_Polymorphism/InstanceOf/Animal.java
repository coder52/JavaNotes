package A39_Polymorphism.InstanceOf;

/*
Java instanceof
java instanceof
Example of instanceof operator
Applying the instanceof operator with a variable the have null value
Downcasting with instanceof operator
Downcasting without instanceof operator
The java instanceof operator is used to test whether the object is an instance of the specified
type (class or subclass or interface).

The instanceof in java is also known as type comparison operator because it compares the instance with type.
It returns either true or false. If we apply the instanceof operator with any variable that has null value, it returns false.

 */

class Animal{

}


class Dog1 extends Animal{      //Dog inherits Animal

    public static void main(String args[]){

        Dog1 d=new Dog1();

        System.out.println("d is instance of Dog1 :" + (d instanceof Dog1));    //true

        System.out.println("d is instance of Animal :" + (d instanceof Animal)); //true

        System.out.println("d is instance of Object :" + (d instanceof Object));      //true

    }
}

package A00.oop.mainInSameClass;

//main within the class

//Java Program to illustrate how to define a class and fields
//Defining a Student class.
class StudentIn {
    //defining fields
    int id;//field or data member or instance variable
    String name;
    //creating main method inside the Student class
    public static void main(String args[]){
        //Creating an object or instance
        StudentIn s1=new StudentIn();//creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);

    }
}

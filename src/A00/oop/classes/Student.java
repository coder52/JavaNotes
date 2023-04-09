package A00.oop.classes;
//Java Program to demonstrate having the main method in
//another class
//Creating Student class.

class Student {

    int id;
    String name;

    void insertRecord(int r, String n){
        id=r;
        name=n;
    }
    void displayInformation(){System.out.println(id+" "+name);}
}



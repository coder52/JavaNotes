package A00.oop.classes.example;

class Employee {
    private int id;
    private String name;
    private float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }

    void display(){

        System.out.println(id+" "+name+" "+salary);

    }
}

package A20_Constructors;

// Constructor tanimlanmazsa Java kendisi bir tane tanimlar
// this kullanilabilir

class Student{
    String firstName;
    String lastName;
    int examResult;
    //...
    public Student(){
        firstName = "name";
        lastName = "Surname";
        examResult = 5;
    }
    // Overloaded constructor
    public Student(String name, String surname){
        this.firstName = name;
        this.lastName = surname;
    }
    // Overloaded constructor
    public Student(String name, String surname, int examR){
        firstName = name;
        lastName = surname;
        examResult = examR;
    }
    public void printInfo(){
        System.out.println(firstName + " " + lastName + " " + examResult);
    }
}

public class JavaConstructors {

    public static void main(String[] args) {

        Student student1 = new Student("John","Raul");
        student1.printInfo();

        Student student2 = new Student();
        student2.printInfo();

        Student student3 = new Student("Cemil","Camci",3);
        student3.printInfo();

    }
}

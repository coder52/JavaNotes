package A00.oop.classes;

public class InitializationTroughMethod {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.insertRecord(5,"Ali");
        s2.insertRecord(10, "Mehmet");

        s1.displayInformation();
        s2.displayInformation();

    }
}

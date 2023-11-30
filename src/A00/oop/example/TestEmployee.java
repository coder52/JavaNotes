package A00.oop.example;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.insert(1, "Ali", 3.22f);
        e2.insert(2,"Mehmet", 4.44f);
        e3.insert(3, "Cemil", 22.22f);

        e1.display();
        e2.display();
        e3.display();

    }
}

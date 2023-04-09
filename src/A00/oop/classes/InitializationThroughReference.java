package A00.oop.classes;

public class InitializationThroughReference {

    public static void main(String[] args) {

        Student s1 = new Student(), s2 = new Student();

        s1.id = 101;
        s1.name = "Mehmet";

        s2.id = 102;
        s2.name = "Elvan";

        System.out.println(s1.id + "." + s1.name);
        System.out.println(s2.id + "." + s2.name);

    }
}

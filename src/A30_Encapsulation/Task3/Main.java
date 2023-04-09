package A30_Encapsulation.Task3;

public class Main {
//    create class School with 5 attributes
//    and with extra one attribute as List<Student> students
//            (which means you need to create class Student)
//
//    encapsulate School and Student class
//
//    create 2 schools and at least 3 students in each school

    public static void main(String[] args) {

        School school1 = new School("NLK", "Newyork", "NC", 100);
        school1.setNumOfTeachers(30);
        school1.registerStudent("John", "8A");
        school1.registerStudent("Alice","9B");
        school1.registerStudent("Oliver","5C");

        School school2 = new School("KTL","Alabama", "AL",100);
        school2.setNumOfTeachers(20);
        Student student = new Student();
            student.setName("Elvis");
            student.setId(33);
            student.setSchoolClass("3B");
        school2.registerStudent(student);
        school2.registerStudent("Hans","3C");
        school2.registerStudent("Frank","5A");

        System.out.println(school1);
        System.out.println(school1.getStudent(1));



    }
}

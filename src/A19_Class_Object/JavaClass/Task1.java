package A19_Class_Object.JavaClass;


public class Task1 {

    public static void main(String[] args) {
        School school1 = new School();
        school1.name = "NLP";
        school1.address = "Bahnhofstr.30, 56575 Weissenthurm";

        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Damir";
        student1.surname = "Batyr";
        student1.school = school1;

        Student student2 = new Student();
        student2.id = 1;
        student2.name = "Damir";
        student2.surname = "Batyr";
        student2.school = school1;

        student1.school.name = "KTL";


    }
}

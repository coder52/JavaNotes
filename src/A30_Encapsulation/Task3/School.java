package A30_Encapsulation.Task3;


import java.util.ArrayList;
import java.util.List;

public class School {

    private static int id=0;
    private String name;
    private String city;
    private String state;
    private int numOfTeachers;
    private List<Student> students;
    private static int studentId=0;
    private final int schoolSize;


    public School(String name, String city, String state, int schoolSize) {
        students = new ArrayList<Student>();
        this.id++;
        this.name = name;
        this.city = city;
        this.state = state;
        this.schoolSize = schoolSize;

    }

    public int getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCity(){
        return this.city;
    }

    public String getState(){
        return this.state;
    }

    public void setNumOfTeachers(int numOfTeachers) {
        this.numOfTeachers = numOfTeachers;
    }

    public int getNumOfTeachers(){
        return this.numOfTeachers;
    }

    public void registerStudent(Student student) throws RuntimeException{
        if(students.size()== schoolSize){
            throw new RuntimeException("No place for new student.");
        }
        student.setId(++studentId);  // studentin idsini okula gore degistirdik.
        students.add(student);
    }

    public void registerStudent(String name, String schoolClass)throws RuntimeException{
        if(students.size()== schoolSize){
            throw new RuntimeException("No place for new student.");
        }
        Student student= new Student();
        student.setId(++studentId);
        student.setName(name);
        student.setSchoolClass(schoolClass);
        students.add(student);

    }

    public Student getStudent(int studentId){
        Student result = new Student();
        for ( Student student:this.students ) {
            if(student.getId()==studentId){
                result = student;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", numOfTeachers=" + numOfTeachers +
                ", students=" + students +
                '}';
    }
}

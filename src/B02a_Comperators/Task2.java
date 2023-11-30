package B02a_Comperators;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Sorter implements Comparator{
    public int compare(Object obj1,Object obj2){
        Student s1=(Student) obj1;
        Student s2=(Student) obj2;

//        if(s1.getCgpa()==s2.getCgpa()){
//            if(s1.getId()==s2.getId())
//                return 0;
//            else if(s1.getId()>s2.getId())
//                return -1;
//            else
//                return 1;
//        }
        if(s1.getCgpa()==s2.getCgpa())
            return s1.getFname().compareTo(s2.getFname());
        else if(s1.getCgpa()>s2.getCgpa())
            return -1;
        else
            return 1;
    }
}

public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Sorter sorter = new Sorter();
        Collections.sort(studentList, sorter);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

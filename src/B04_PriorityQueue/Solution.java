package B04_PriorityQueue;

import java.util.*;


/*
Bu alistirmada PriorityQueue Comparators ve Comparable ile beraber kullnaimina ornek veriyoruz.

Bu alistirmada ENTER komutu gorulunce yeni kayit yapilmali ve SERVED komutu gorulunce CGPA'si en yuksek olan kisi
listeden cikarilmali.
Consola girilen inputun ilk sayisi kac giris yapilacagini gosterir. Daha sonra "ENTER name CGPA id" yada SERVED
komutlari gorulecektir
    Input:
        12
        ENTER John 3.75 50
        ENTER Mark 3.8 24
        ENTER Shafaet 3.7 35
        SERVED
        SERVED
        ENTER Samiha 3.85 36
        SERVED
        ENTER Ashley 3.9 42
        ENTER Maria 3.6 46
        ENTER Anik 3.95 49
        ENTER Dan 3.95 50
        SERVED
    Output:
        Dan
        Ashley
        Shafaet
        Maria

 Dikkat ederseniz Student class Comparable interface'ini implement ediyor ve boylece Student ile olusturlacak
 olan Queue, compareTo metodunun kurallarina gore otomatik siralanacak.
 */

class Student implements Comparable<Student>{

    private int id;
    private String name;
    private double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student student) {
        if(student.getCgpa()>this.cgpa){
            return 1;
        }else if(student.getCgpa()<this.cgpa){
            return -1;
        }else{
            return name.compareTo(student.name);
        }
    }
}

class Checker implements Comparator{
    public int compare(Object obj1,Object obj2){
        Student s1=(Student) obj1;
        Student s2=(Student) obj2;

        if(s1.getCgpa() == s2.getCgpa())
            return s1.getName().compareTo(s2.getName());
        else if(s1.getCgpa() > s2.getCgpa())
            return -1;
        else
            return 1;
    }
}

class Priorities {
    List<Student> getStudents(List<String> events){
        Queue<Student> queue = new PriorityQueue<>();
        Checker checker = new Checker();
        for (int i = 0; i < events.size(); i++) {
            Scanner input = new Scanner(events.get(i));
            String command = input.next();
            if (command.equals("ENTER")) {
                String name = input.next();
                Double cgpa = Double.parseDouble(input.next());
                int id = input.nextInt();
                Student student= new Student(id, name, cgpa);
                queue.add(student);
            } else if (command.equals("SERVED"))  {
                if(!queue.isEmpty()){
                    queue.remove();
                }
            }
        }
        List<Student> students = new ArrayList<Student>() ;
        for (Student st:queue) {
            students.add(st);
        }
        Collections.sort(students, checker);
        return students;
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName()+" "+ st.getCgpa()+" "+st.getId());
            }
        }
    }
}
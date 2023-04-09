package A20_Constructors;

// There can be a lot of usage of java this keyword.
// In java, this is a reference variable that refers to the current object.

class Employe{
    int rollno;
    String name;
    float fee;
    Employe(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    Employe(int rollno,String name,float fee){
        this(rollno, name);         // this burda bir once ki constructor fonksiyonu gibi kullanildi.
        this.fee=fee;
    }

    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

public class JavaThis {

    public static void main(String args[]){
        Employe s1=new Employe(111,"John",5000f);
        Employe s2=new Employe(112,"Kate",6000f);
        s1.display();
        s2.display();
    }
}

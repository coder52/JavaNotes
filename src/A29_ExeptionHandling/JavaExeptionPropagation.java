package A29_ExeptionHandling;

// Bu örnekte metodlar bırbırını cagırsada en onde kı metoda yazılan try blogu sırayla hepsıne yayılıyor
//   buna exeption chain deniliyor.
// Fakat checked exeption (yani compilerin kontrolettigi hatalar.) olsa idi compile time error olurdu.

public class JavaExeptionPropagation {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String args[]){
        JavaExeptionPropagation obj=new JavaExeptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}

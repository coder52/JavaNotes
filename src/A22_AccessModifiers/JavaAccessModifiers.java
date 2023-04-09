package A22_AccessModifiers;


import A21_Junit_Test.Calculation;

class A{
    // privateleri uncomment yap boylece asagida ki hatalar olustugunu gorebilirsin.
    /*private*/ int data=40;
    /*private*/ void msg(){System.out.println("Hello java");}
}

public class JavaAccessModifiers {

    public static void main(String args[]){
        A obj=new A();
        System.out.println(obj.data);   //Compile Time Error
        obj.msg();                      //Compile Time Error

        int[] arr ={1,2,3};
        Calculation.findMax(arr );  // We can access Calculation class in other package
                                        // because it is public.
    }
}

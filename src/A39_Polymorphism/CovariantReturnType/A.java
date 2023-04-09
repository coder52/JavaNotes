package A39_Polymorphism.CovariantReturnType;
// Normalde return tipi uzerinden overload olmaz.
// Bu konu biraz karisik ama anladigim kadariyla ayni manaya gelen return tipine gore overridinge izin veriyor.
// Fakat return tipip birininki String digeri int olsa buna izin vermiyor.
// Asagida ki ornekte goruldugu gibi A sinifinin get metodunun return tipi A, ve onu override yapan B nin donus tipi ise
// B'dir.

class A{
    A get(){return this;}
}

class B1 extends A{
    B1 get(){return this;}
    void message(){
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]){

        new B1().get().message();

    }
}
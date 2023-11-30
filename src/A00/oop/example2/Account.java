package A00.oop.example2;

class Account {

    int acc_no;
    String name;
    float amount;
    // Method to initialize the object
    void initialize(int a, String n, float amt){

        acc_no = a;
        name = n;
        amount = amt;

    }

    //Depozit Method
    void deposit (float amt){

        amount = amount + amt;
        System.out.println(amt + " depozitet.");

    }

    // Withdraw method
    void withdraw(float amt){

        if(amount<amt){
            System.out.println("Insufficient Balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }

    }

    //method to check the balance of the account
    void checkBalance(){System.out.println("Balance is: "+amount);}

    //method to display the values of an object
    void display(){System.out.println(acc_no+" "+name+" "+amount);}

}

package A00.oop.classes.example2;

public class TestAccount {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.initialize(832345, "Ali", 10000);

        acc.display();
        acc.checkBalance();
        acc.deposit(40000);
        acc.checkBalance();
        acc.withdraw(15000);
        acc.checkBalance();

    }

}

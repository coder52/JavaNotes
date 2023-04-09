package A30_Encapsulation.Task2;

public class Bank {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.setCurrency(MyCurrencyEnum.USD);
        account1.setNumber("001");
        //account1.setBalance(500_000);
        account1.deposit(500);
        account1.withdraw(100);

        Account account2 = new Account(MyCurrencyEnum.EU);
        account2.setNumber("002");
        //account2.setBalance(700_000);
        account2.deposit(3000);

        Account account3 = new Account(MyCurrencyEnum.USD);
        account3.setCurrency(MyCurrencyEnum.EU);
        account3.setNumber("003");
//        account3.setBalance(1_500_000);
//        account3.withdraw(100);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3.toString());

    }
}

package A38_AbstractKeyword.Task5;

public class Main {

    public static void main(String[] args) {

        Chase chaseBank = new Chase("Chase", "Main", "abc@gmail.com", "123456",
                3000.45, 1.002, 1.001);

        chaseBank.withdraw(200);
        chaseBank.deposit(100);

        chaseBank.buyEuroWithDollar(100);

        chaseBank.sellEuroWithDollar(300);

        System.out.println(chaseBank);

    }

}





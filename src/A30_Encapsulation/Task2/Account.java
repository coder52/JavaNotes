package A30_Encapsulation.Task2;


public class Account {

    private MyCurrencyEnum currency;
    private String number;
    private double balance;

    public Account() { }

    public Account(MyCurrencyEnum currency) {
        this.currency = currency;
    }

    public void setCurrency(MyCurrencyEnum currency){
        this.currency = currency;
    }

    public MyCurrencyEnum getCurrency() {
        return currency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = currency + number;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double money){

        if(this.balance<money){

            throw new RuntimeException("Insufficient funds. Money = " + currency.getSymbol() + money);

        }

        this.balance -= money;

    }

    public void deposit(double money){

        this.balance += money;

    }


    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance + currency.getSymbol() +
                '}';
    }
}

package A38_AbstractKeyword.Task5;

public class BankOfAmerica extends Bank{
    public BankOfAmerica(String name, String address, String email, String phone, double balance) {
        super(name, address, email, phone, balance);
    }

    @Override
    public double buyEuroWithDollar(double amount) {
        return amount * 1.002;
    }

    @Override
    public double sellEuroWithDollar(double amount) {
        return amount * 0.98;
    }
}

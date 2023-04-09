package A38_AbstractKeyword.Task5;

public class Chase extends Bank{

    private double buyRate;
    private double sellRate;

    public Chase(String name, String address, String email, String phone, double balance, double buyRate, double sellRate) {
        super(name, address, email, phone, balance);
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }



    @Override
    public double buyEuroWithDollar(double amount) {

        //withdraw(amount);

        return amount * buyRate;
    }

    @Override
    public double sellEuroWithDollar(double amount) {

        amount = amount * sellRate;

        //deposit(amount);

        return amount;
    }
}

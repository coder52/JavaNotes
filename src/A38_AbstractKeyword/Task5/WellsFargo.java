package A38_AbstractKeyword.Task5;

public class WellsFargo extends Bank{
    public WellsFargo(String name, String address, String email, String phone, double balance) {
        super(name, address, email, phone, balance);
    }

    @Override
    public double buyEuroWithDollar(double amount) {
        return 0;
    }

    @Override
    public double sellEuroWithDollar(double amount) {
        return 0;
    }
}

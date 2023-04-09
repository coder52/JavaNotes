package A38_AbstractKeyword.Task5;


public abstract class Bank {

    private String Name;
    private String Address;
    private String Email;
    private String Phone;
    private double balance;
    Currency currency;

    public Bank(String name, String address, String email, String phone, double balance) {
        this.Name = name;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
        this.balance = balance;

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

    public abstract double buyEuroWithDollar(double amount);

    public abstract double sellEuroWithDollar(double amount);

    @Override
    public String toString() {
        return "Bank{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", balance=" + balance +
                ", currency=" + currency +
                '}';
    }
}

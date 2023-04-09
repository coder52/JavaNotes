package A30_Encapsulation.Task2;

public enum MyCurrencyEnum {

    USD("$"), EU("€");

    private String symbol;

    MyCurrencyEnum(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }

}

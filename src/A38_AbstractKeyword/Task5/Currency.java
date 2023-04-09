package A38_AbstractKeyword.Task5;

public enum Currency {

    USD("$"), EUR("€"), TL("₺");

    String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

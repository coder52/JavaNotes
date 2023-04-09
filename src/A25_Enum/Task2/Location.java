package A25_Enum.Task2;

public enum Location {
    NEWYORK(38,"A"),
    NEWJERSAY(28, "B"),
    OHIO(25, "C"),
    ATLANTA(28, "D"),
    PITSBURG(10, "E");

    private final int tax;
    private final String sign;


    Location (int tax, String sign){
        this.tax = tax;
        this.sign= sign;
    }

    public int getTax(){
        return this.tax;
    }
    public String getSign() {return this.sign;}
}

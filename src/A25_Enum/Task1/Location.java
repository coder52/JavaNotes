package A25_Enum.Task1;

public enum Location {
    NEWYORK(38), NEWJERSAY(28), OHIO(25), ATLANTA(28), PITSBURG(10);

    private final int tax;


    Location (int tax){
        this.tax = tax;
    }

    public int getTax(){
        return this.tax;
    }
}

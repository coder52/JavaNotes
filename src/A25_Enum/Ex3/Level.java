package A25_Enum.Ex3;

public enum Level {

    HIGH(1),
    MEDIUM(2),
    LOW(3);

    public int levelNumber;

    Level(int levelNumber) {
        this.levelNumber = levelNumber;
    }
}

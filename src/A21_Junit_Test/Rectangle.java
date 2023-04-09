package A21_Junit_Test;

public class Rectangle{
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length + width;
    }
}


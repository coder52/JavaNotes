package A21_Junit_Test;

// Calculation ve Rectangle siniflari icin basit testler icerir.

import org.junit.Assert;
import org.junit.Test;

public class JavaJUnit {

    @Test
    public void testGetArea(){

        Rectangle rect1 = new Rectangle(5,10);
        int result = rect1.getArea();

        Assert.assertEquals("Get Area method is not correct",50,result);
    }

    @Test
    public void testSum(){
        int testSum = 15+3;

        Assert.assertEquals("Sum is wrong",20,testSum);
    }

    @Test
    public void testTrue(){
        boolean actual= (true && true) || (false && true);

        Assert.assertEquals("Bool wrong", true, actual);
    }

    @Test
    public void testFindMax(){

        Assert.assertEquals("", 4,Calculation.findMax(new int[]{1,3,4,2}));
        Assert.assertEquals("", -1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
    }



}

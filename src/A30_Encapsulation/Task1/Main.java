package A30_Encapsulation.Task1;

import org.junit.Assert;
import org.junit.Test;

public class Main {

    @Test
    public void testThreePrices_success(){

        Book book1 = new Book();
        book1 = new Book("book1","author1","01.01.2015",
                10.5f,14.4f, 7.5f);
        boolean actual = book1.hasThreePrices();

        Assert.assertTrue(actual);

    }
    @Test
    public void testThreePrices_fail(){

        Book book2 = new Book();
        book2 = new Book("book2","author2","02.01.2017",
                0,7.4f, 3.5f);

        boolean actual = book2.hasThreePrices();

        Assert.assertFalse(actual);

    }



}

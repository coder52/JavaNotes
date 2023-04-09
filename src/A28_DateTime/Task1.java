package A28_DateTime;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task1 {


    @Test
    public void plusTimeTest(){

        // Simdiki zamanin 1 saat i dk sonrasini test eder.
        // testin basarili olmasi icin su anki zamandan expected yerine  1 saat 1 dakika sonrayi yaziniz

        LocalTime localTime = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime updatedTime = localTime.plusHours(1).plusMinutes(1);

        System.out.println(updatedTime.format(timeFormatter));

        Assert.assertEquals("09:36", updatedTime.format(timeFormatter));

    }
    @Test
    public void minusTimeTest(){

        // Simdiki zamanin 1 saat i dk oncesini test eder. expected yerine  1 saat 1 dakika oncesini yaziniz

        LocalTime localTime = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime updatedTime = localTime.minusHours(1).minusMinutes(1);

        String actual = updatedTime.format(timeFormatter);
        String expected = "19:03";

        Assert.assertEquals(expected, actual);


    }


}

package A28_DateTime.Manupulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateAndTimeManupulation {
        /*
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        today.plusDays(5); // bu bir ise yaramaz asagida ki gibi yapmalisin
        LocalDate projectDay = today.plusDays(5);   // today = today.plusDays(5); ise yarar

        System.out.println(projectDay);   //2020-05-24    bu gun: 2020-05-19 idi
    }
    */

    @Test
    public void testProjectData(){

        LocalDate today = LocalDate.now();
        LocalDate projectDay = today.plusDays(5);

        Assert.assertEquals(24, projectDay.getDayOfMonth());
        Assert.assertEquals(Month.MAY, projectDay.getMonth());

    }
}

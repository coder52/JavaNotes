package A28_DateTime.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriod {

    public static void main(String[] args) {

        LocalDate newYear = LocalDate.of(2021,01,01);
        LocalDate today = LocalDate.now();

        Period between = Period.between(newYear, today);  // Bu gun ile yilbasi arasindaki farki verir.
        System.out.println("AA "+between);
        int years = between.getYears();  //yil farki
        int months = between.getMonths(); // ay farki
        int days = between.getDays();       // gun farki

        Period periodOf3days = Period.ofDays(3);  // 3 gunluk periyod
        Period quarterOfYear = Period.ofMonths(3); // 3 aylik periyod

        LocalDate plus = today.plus(periodOf3days); // bu gune  3 gun ejkleyip plus degiskenine atadik
        LocalDate minus = today.minus(quarterOfYear);   // bu gunden 3 ay cikarip minus degiskenine atadik

        System.out.println(years);
        System.out.println(plus);



    }
}

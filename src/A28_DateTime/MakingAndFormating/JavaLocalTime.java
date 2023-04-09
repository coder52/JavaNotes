package A28_DateTime.MakingAndFormating;

//import java.time.LocalTime;


import java.time.LocalTime;

public class JavaLocalTime {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();      // 17:37:38.501174

        LocalTime localTime1 = LocalTime.of(10,05);                 // 10:05
        LocalTime localTime2 = LocalTime.of(10,05,30);       // 10:05:30

        int hour = localTime.getHour();         // 17
        int minute = localTime.getMinute();     // 45
        int second = localTime.getSecond();     // 11


        System.out.println(second);

    }
}

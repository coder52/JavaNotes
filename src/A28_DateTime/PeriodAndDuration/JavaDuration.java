package A28_DateTime.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class JavaDuration {

    public static void main(String[] args) {

        LocalTime midnight = LocalTime.of(00,00);

        LocalTime onePM = LocalTime.of(13,00);

        Duration between = Duration.between(midnight, onePM);

        System.out.println(between);

        Long second = between.getSeconds();

        Duration durationOfCourse = Duration.ofHours(3);

        LocalTime startOfJavaCourse =LocalTime.of(9,00);

        LocalTime endOfCourse =startOfJavaCourse.plus(durationOfCourse);

        System.out.println(endOfCourse); //12:00



    }
}

package A28_DateTime;


import java.util.Calendar;

public class CalendarMethod {
    /*
    Tarih yonetimi icin kullanilan baska bir class (Calendar class) ile ilgili birkac ornek yapalim burda
     */
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,7,05);

        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("Current DAY: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("The Current Date is:" + calendar.getTime());
    }
}


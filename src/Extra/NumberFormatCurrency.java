package Extra;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.text.NumberFormat.getCurrencyInstance;

public class NumberFormatCurrency {
    public static void main(String[] args) {

        double payment = 12324.134;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = usFormat.format(payment);

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = indiaFormat.format(payment);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(new Locale("fr", "fr"));
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

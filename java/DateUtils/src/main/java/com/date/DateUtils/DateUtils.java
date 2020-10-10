package com.date.DateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/**
 * A class for general utilities involving dates. Using Java 8 Dates instead of old Java Dates
 */
public class DateUtils {

    private static final String BR_FORMAT = "dd/MM/yyyy";

    public static void daysIntoYear() {
        System.out.println("We are " + daysIntoTheYear() +  " days into the year.");
    }

    private static int daysIntoTheYear() {
        final LocalDate today = LocalDate.now();
        final LocalDate beginning = LocalDate.ofYearDay(today.getYear(), 1);

        return (int) ChronoUnit.DAYS.between(beginning, today);
    }

    public static void whatDayIsToday() {
        System.out.println("Today is " + formatDateBR(LocalDate.now()));
    }

    public static String formatDateBR(final LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(BR_FORMAT));
    }

}



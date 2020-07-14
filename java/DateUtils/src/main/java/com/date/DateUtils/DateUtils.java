package com.date.DateUtils;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/**
 * A class for general utilities involving dates. Using Java 8 Dates instead of old Java Dates
 */
@Slf4j
public class DateUtils {

    private static final String BR_FORMAT = "dd/MM/yyyy";

    public static void daysIntoYear() {
        log.info("We are {} days into the year.", daysIntoTheYear());
    }

    private static int daysIntoTheYear() {
        final LocalDate today = LocalDate.now();
        final LocalDate beginning = LocalDate.ofYearDay(today.getYear(), 1);

        return (int) ChronoUnit.DAYS.between(beginning, today);
    }

    public static void whatDayIsToday() {
        log.info("Today is {}.", formatDateBR(LocalDate.now()));
    }

    public static String formatDateBR(final LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(BR_FORMAT));
    }

}



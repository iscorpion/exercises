package com.date.DateUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * These aren't strict tests, but mostly a simple way of calling methods, instead of creating a main class.
 */
@RunWith(JUnit4.class)
public class DateUtilsTests {

    @Test
    public void daysIntoYear() {
        DateUtils.daysIntoYear();
    }

    @Test
    public void today() {
        DateUtils.whatDayIsToday();
    }
}

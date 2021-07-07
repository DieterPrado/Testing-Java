package org.example.javatests.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DateUtilShould {
    @Test
    public void return_true_when_year_is_divisible_by_400(){
        int year;
        assertThat( DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat( DateUtil.isLeapYear(1200), is(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400(){
        int year;
        assertThat( DateUtil.isLeapYear(1700), is(false));
        assertThat( DateUtil.isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100(){
        int year;
        assertThat( DateUtil.isLeapYear(1300), is(false));
        assertThat( DateUtil.isLeapYear(100), is(false));
        assertThat( DateUtil.isLeapYear(200), is(false));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4(){
        int year;
        assertThat( DateUtil.isLeapYear(3), is(false));
        assertThat( DateUtil.isLeapYear(2017), is(false));
        assertThat( DateUtil.isLeapYear(2018), is(false));
    }
}
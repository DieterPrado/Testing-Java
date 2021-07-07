package org.example.javatests.util;

public class DateUtil {
    public static boolean isLeapYear(int year){
        if (year % 400 == 0) {
            return true;
        }else return (year % 4 == 0) && (year % 100 != 0);
    }
}

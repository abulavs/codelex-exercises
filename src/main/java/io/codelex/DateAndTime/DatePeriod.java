package io.codelex.DateAndTime;

import java.time.LocalDate;

public class DatePeriod {
    static LocalDate intersectionStart;
    static LocalDate intersectionEnd;

    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2021, 01, 01);
        LocalDate firstEnd = LocalDate.of(2021, 07, 01);
        LocalDate secondStart = LocalDate.of(2021, 04, 01);
        LocalDate secondEnd = LocalDate.of(2021, 12, 01);

        intersection(firstStart, firstEnd, secondStart, secondEnd);
    }


    public static void intersection(LocalDate firstStart, LocalDate firstEnd, LocalDate secondStart, LocalDate secondEnd) {
        if (!(firstEnd.isBefore(secondStart))) {
            intersectionStart = firstEnd;
            intersectionEnd = secondStart;
            System.out.println(intersectionStart + "-" + intersectionEnd);
        }
        if (!(secondEnd.isBefore(firstStart))) {
            intersectionStart = firstStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
        if (!(firstStart.equals(secondStart)) && !(secondEnd.equals(firstEnd))) {
            intersectionStart = firstStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
        if (!(firstStart.equals(secondStart)) && !(secondEnd.isBefore(firstEnd))) {
            intersectionStart = firstStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
        if (!(firstStart.equals(secondStart)) && !(firstEnd.isBefore(secondEnd))) {
            intersectionStart = firstStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
        if (!(firstStart.isBefore(secondStart)) && !(firstEnd.equals(secondEnd))) {
            intersectionStart = secondStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
        if (!(secondStart.isBefore(firstStart)) && !(firstEnd.equals(secondEnd))) {
            intersectionStart = firstStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + " " + intersectionEnd);
        }
    }
}

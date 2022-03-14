package io.codelex.DateAndTime;

import java.time.LocalDate;

public class Intersection {
    LocalDate firstStart;
    LocalDate firstEnd;
    LocalDate secondStart;
    LocalDate secondEnd;
    static LocalDate intersectionStart;
    static LocalDate intersectionEnd;

    public Intersection(String firstStart, String firstEnd, String secondStart, String secondEnd) {
        this.firstStart = LocalDate.parse(firstStart);
        this.firstEnd = LocalDate.parse(firstEnd);
        this.secondStart = LocalDate.parse(secondStart);
        this.secondEnd = LocalDate.parse(secondEnd);
    }

    public void checkIntersection() {
        if ((firstEnd.isBefore(secondStart)) || secondEnd.isBefore(firstStart)) {
            System.out.println("Intersection not detected");
        } else if (firstEnd.isBefore(secondEnd) && firstStart.isBefore(secondStart)) {
            intersectionStart = secondStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if (secondEnd.isBefore(firstEnd) && secondStart.isBefore(firstStart)) {
            intersectionStart = firstStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if (firstStart.equals(secondStart) && secondEnd.equals(firstEnd)) {
            intersectionStart = firstStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if ((firstStart.equals(secondStart)) && secondEnd.isBefore(firstEnd)) {
            intersectionStart = firstStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if ((firstStart.equals(secondStart)) && firstEnd.isBefore(secondEnd)) {
            intersectionStart = firstStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if (firstStart.isBefore(secondStart) && firstEnd.equals(secondEnd)) {
            intersectionStart = secondStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if (secondStart.isBefore(firstStart) && firstEnd.equals(secondEnd)) {
            intersectionStart = firstStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if (firstStart.isBefore(secondStart) && secondEnd.isBefore(firstEnd)) {
            intersectionStart = secondStart;
            intersectionEnd = secondEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        } else if (secondStart.isBefore(firstStart) && firstEnd.isBefore(secondEnd)) {
            intersectionStart = firstStart;
            intersectionEnd = firstEnd;
            System.out.println(intersectionStart + "  -  " + intersectionEnd);
        }
    }
}

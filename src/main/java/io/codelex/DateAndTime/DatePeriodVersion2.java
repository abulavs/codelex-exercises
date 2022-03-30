package io.codelex.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriodVersion2 {
    LocalDate start;
    LocalDate end;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public DatePeriodVersion2(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriodVersion2 firstPeriod = new DatePeriodVersion2(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriodVersion2 secondPeriod = new DatePeriodVersion2(secondStart, secondEnd);

        DatePeriodVersion2 overlap = firstPeriod.intersection(secondPeriod);

        if (overlap == null) {
            System.out.println("Intersection not detected");
        } else {
            System.out.println(formatter.format(overlap.start) + " - " + formatter.format(overlap.end));
        }
    }

    private DatePeriodVersion2 intersection(DatePeriodVersion2 secondPeriod) {
        if ((end.isBefore(secondPeriod.start)) || secondPeriod.end.isBefore(start)) {
            return null;
        } else if (end.isBefore(secondPeriod.end) && start.isBefore(secondPeriod.start)) {
            return new DatePeriodVersion2(secondPeriod.start, end);
        } else if (secondPeriod.end.isBefore(end) && secondPeriod.start.isBefore(start)) {
            return new DatePeriodVersion2(start, secondPeriod.end);
        } else if (start.equals(secondPeriod.start) && secondPeriod.end.equals(end)) {
            return new DatePeriodVersion2(start, secondPeriod.end);
        } else if ((start.equals(secondPeriod.start)) && secondPeriod.end.isBefore(end)) {
            return new DatePeriodVersion2(start, secondPeriod.end);
        } else if ((start.equals(secondPeriod.start)) && end.isBefore(secondPeriod.end)) {
            return new DatePeriodVersion2(start, end);
        } else if (start.isBefore(secondPeriod.start) && end.equals(secondPeriod.end)) {
            return new DatePeriodVersion2(secondPeriod.start, end);
        } else if (secondPeriod.start.isBefore(start) && end.equals(secondPeriod.end)) {
            return new DatePeriodVersion2(start, end);
        } else if (start.isBefore(secondPeriod.start) && secondPeriod.end.isBefore(end)) {
            return new DatePeriodVersion2(secondPeriod.start, secondPeriod.end);
        } else if (secondPeriod.start.isBefore(start) && end.isBefore(secondPeriod.end)) {
            return new DatePeriodVersion2(start, end);
        }
        return null;
    }
}

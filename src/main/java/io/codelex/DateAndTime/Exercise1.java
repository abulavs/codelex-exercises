package io.codelex.DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise1 {


    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2021, 01, 01);
        LocalDate date2 = LocalDate.of(2021, 02, 01);
        int workingDaysCount = 0;
        int workingHours = 8;

        for (LocalDate i = date1; date1.isBefore(date2); date1 = date1.plusDays(1)) {
            if (isWorkingDay(date1)) {
                workingDaysCount++;
            }
        }

        System.out.println(workingDaysCount * workingHours);
    }

    public static boolean isWorkingDay(LocalDate date) {
        if (!(date.getDayOfWeek().equals(DayOfWeek.SATURDAY)) && !(date.getDayOfWeek().equals(DayOfWeek.SUNDAY))) {
            return true;
        }
        return false;
    }
}

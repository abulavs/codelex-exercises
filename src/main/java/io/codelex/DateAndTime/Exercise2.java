package io.codelex.DateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 01, 01);
        LocalDate date2 = LocalDate.of(2022, 01, 01);
        date.plusDays(14);
        int month = Month.valueOf("APRIL").getValue();
        for (LocalDate i = date; date.isBefore(date2); date = date.plusDays(14)) {
            if ((date.getMonth().equals(month))) {
                System.out.println(date.getDayOfMonth());
            }
        }
    }
}
//System.out.println(Month.valueOf("APRIL").getValue());

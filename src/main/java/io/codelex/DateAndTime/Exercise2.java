package io.codelex.DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter server launch date (yyyy-mm-dd)");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(in.nextLine(), dateFormat);

        System.out.println("Please enter a request date?  (yyyy-mm)");
        LocalDate requestDate = LocalDate.parse(in.nextLine() + "-01", dateFormat);


        for (LocalDate i = startDate; startDate.isBefore(startDate.plusYears(7000)); startDate = startDate.plusDays(14)) {
            if (startDate.getMonth().equals(requestDate.getMonth()) && startDate.getYear() == (requestDate.getYear())) {
                System.out.println(startDate.getDayOfMonth());
            }
            if (startDate.isAfter(requestDate.plusMonths(1))) {
                break;
            }
        }
    }
}


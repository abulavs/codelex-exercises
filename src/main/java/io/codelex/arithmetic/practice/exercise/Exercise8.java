package io.codelex.arithmetic.practice.exercise;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercise8 {
    public static void main(String[] args) {
        String headingEmployee = "Employee";
        String headingBasePay = "Base Pay";
        String headingHoursWorked = "Hours Worked";
        String headingTotalPay = "Total Pay";
        System.out.printf("%-10s %13s %13s %10s %n", headingEmployee, headingBasePay, headingHoursWorked, headingTotalPay);
        employee("Employee 1", 7.50, 35);
        employee("Employee 2", 8.20, 47);
        employee("Employee 3", 10.00, 73);
    }

    public static void employee(String name, double basePay, int hours) {
        double minBasePay = 8.00;
        int maxHours = 60;
        int overTime = 0;

        if (hours > 40) {
            overTime = hours - 40;
        }

        double totalPay = (basePay * hours) + (basePay * 1.5 * (overTime));

        if (basePay < minBasePay || hours > maxHours) {
            System.out.printf("%-10s %11s %10s %15s %n", name, NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                    .format(basePay), hours, "error");
        } else {
            System.out.printf("%-10s %11s %10s %15s %n", name, NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                    .format(basePay), hours, NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                    .format(totalPay));
        }
    }
}

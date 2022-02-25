package codelex.arithmetic.practice.exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height(cm)");
        double height = input.nextDouble();
        System.out.println("Enter your weight?(kg)");
        double weight = input.nextDouble();
        double bmi = (weight * 2.2) * 703 / Math.pow((height * 0.3937), 2);
        System.out.println("Your BMI is " + String.format("%.1f", bmi));
        bmiConditional(bmi);
    }

    public static void bmiConditional(double bmi) {
        if (bmi > 25) {
            System.out.println("The person is considered overweight.");
        }
        else if (bmi < 25 && bmi > 18.5) {
            System.out.println("The person weight is considered optimal.");
        }
        else if (bmi < 18) {
            System.out.println("The person is considered underweight.");
        }
    }
}

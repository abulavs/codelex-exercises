package codelex.typesandvariables.practice;


public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        double height;
        double weight;
        double inch = 2.54;
        double pound = 0.453592;

        name = "Zed A. Shaw";
        age = 35;
        height = 74 * inch;  // inches
        weight = 180 * pound; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", height) + " centimeters tall.");
        System.out.println("He's " + String.format("%.2f", weight) + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
        System.out.println("If I add " + age + ", " + String.format("%.2f", height) + ", and " + String.format("%.2f", weight)
                + " I get " + String.format("%.2f", age + height + weight) + ".");
    }
}
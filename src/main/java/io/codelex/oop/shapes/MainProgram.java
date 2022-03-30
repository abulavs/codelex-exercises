package io.codelex.oop.shapes;

public class MainProgram {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("Sides : " + rectangle.getNumSides());
        System.out.println("Width : " + rectangle.getWidth());
        System.out.println("Height : " + rectangle.getHeight());
        System.out.println("Area : " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
        System.out.println("--------------------------------------------");
        Triangle triangle = new Triangle(10, 5);
        System.out.println("Sides : " + triangle.getNumSides());
        System.out.println("Width : " + triangle.getWidth());
        System.out.println("Height : " + triangle.getHeight());
        System.out.println("Area : " + triangle.getArea());
        System.out.println("Perimeter : " + triangle.getPerimeter());
    }
}

package io.codelex.oop.shape;

public class ShapeAPP {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println("Triangle area : " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("---------------------------------");
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Rectangle area : " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("---------------------------------");
        Hexagon hexagon = new Hexagon(6);
        System.out.println("Hexagon area : " + hexagon.calculateArea());
        System.out.println("Hexagon Perimeter: " + hexagon.calculatePerimeter());
        System.out.println("---------------------------------");
        Cone cone = new Cone(2, 4);
        System.out.println("Cone volume : " + cone.calculateVolume());
        System.out.println("Cone area : " + cone.calculateArea());
        System.out.println("---------------------------------");
        Qube qube = new Qube(3);
        System.out.println("Qube volume : " + qube.calculateVolume());
        System.out.println("Qube area : " + qube.calculateArea());
        System.out.println("Qube Perimeter: " + qube.calculatePerimeter());
    }
}

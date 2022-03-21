package io.codelex.oop.shape;

public class ShapeAPP {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Hexagon hexagon = new Hexagon(6, 6, 6, 6, 6, 6);
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());

        Cone cone = new Cone(1, 2, 1);
        System.out.println(cone.calculateVolume());

        Qube qube = new Qube(1, 1, 1);
        System.out.println(qube.calculateVolume());
    }
}

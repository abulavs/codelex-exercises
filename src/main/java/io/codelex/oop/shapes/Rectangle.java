package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle(int numSides) {
        super(numSides);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

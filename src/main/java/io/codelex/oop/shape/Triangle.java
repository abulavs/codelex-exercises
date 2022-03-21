package io.codelex.oop.shape;

import java.math.BigDecimal;
import java.math.MathContext;

public class Triangle extends Shape {
    BigDecimal sideOne;
    BigDecimal sideTwo;
    BigDecimal sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = new BigDecimal(String.valueOf(sideOne));
        this.sideTwo = new BigDecimal(String.valueOf(sideTwo));
        this.sideThree = new BigDecimal(String.valueOf(sideThree));
    }


    @Override
    public BigDecimal calculatePerimeter() {
        return sideOne.add(sideTwo).add(sideThree);
    }

    @Override
    public BigDecimal calculateArea() {
        MathContext mc = new MathContext(5);
        BigDecimal s = sideOne.add(sideTwo).add(sideThree).divide(BigDecimal.valueOf(2));
        BigDecimal c = (s.multiply(s.subtract(sideOne).multiply(s.subtract(sideTwo).multiply(s.subtract(sideThree)))));
        return c.sqrt(mc);
    }


}

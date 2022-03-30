package io.codelex.oop.shape;

import java.math.BigDecimal;

public abstract class ThreeDShape extends Shape {


    public abstract BigDecimal calculateVolume();


    @Override
    public BigDecimal calculatePerimeter() {
        return null;
    }

    @Override
    public BigDecimal calculateArea() {
        return null;
    }
}

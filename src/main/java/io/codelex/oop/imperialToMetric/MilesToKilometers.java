package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MilesToKilometers extends UnitConverter {
    @Override
    public BigDecimal getCoefficent() {
        return new BigDecimal(1.609344);
    }
}

package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MilesToKilometers extends UnitConverter {
    @Override
    protected BigDecimal getCoefficent() {
        return new BigDecimal(1.609344);
    }
}

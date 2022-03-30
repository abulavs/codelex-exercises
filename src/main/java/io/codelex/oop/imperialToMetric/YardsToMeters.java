package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class YardsToMeters extends UnitConverter {
    @Override
    public BigDecimal getCoefficent() {
        return new BigDecimal(0.9144);
    }
}

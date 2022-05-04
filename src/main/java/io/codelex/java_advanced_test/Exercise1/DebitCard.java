package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {
    public DebitCard(Integer number, String ownerFullName, String ccvCode, int balance) {
        super(number, ownerFullName, ccvCode, BigDecimal.valueOf(balance));
    }


    @Override
    public void addMoney(double value) {
        super.addMoney(value);
        BigDecimal toMuchLimit = BigDecimal.valueOf(10000);
        // int res = (getBalance()).compareTo(toMuchLimit);
        if ((getBalance()).compareTo(toMuchLimit) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}

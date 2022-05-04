package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {


    public CreditCard(Integer number, String ownerFullName, String ccvCode, int balance) {
        super(number, ownerFullName, ccvCode, BigDecimal.valueOf(balance));
    }


    @Override
    public void takeOutMoney(double value) throws NotEnoughFundsException {
        super.takeOutMoney(value);
        BigDecimal limit = BigDecimal.valueOf(100);
        if ((getBalance().subtract(BigDecimal.valueOf(value))).compareTo(limit) < 0) {
            System.out.println("Warning: Low funds");
        }
    }
}

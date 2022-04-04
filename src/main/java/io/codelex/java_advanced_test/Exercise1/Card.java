package io.codelex.java_advanced_test.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private Integer number;
    private String ownerFullName;
    private String ccvCode;
    private BigDecimal balance;

    public Card(Integer number, String ownerFullName, String ccvCode, BigDecimal balance) {
        this.number = number;
        this.ownerFullName = ownerFullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void addMoney(double value) {
        balance = balance.add(BigDecimal.valueOf(value));

    }

    public void takeOutMoney(double value) throws NotEnoughFundsException {
        //   balance.subtract(value);
        if (balance.subtract(BigDecimal.valueOf(value)).compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("Out of balance");

        } else {
            balance = balance.subtract(BigDecimal.valueOf(value));
        }
    }
}
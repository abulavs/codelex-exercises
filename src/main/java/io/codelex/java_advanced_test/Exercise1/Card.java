package io.codelex.java_advanced_test.Exercise1;

public abstract class Card {
    private Integer number;
    private String ownerFullName;
    private String ccvCode;
    private double balance;

    public Card(Integer number, String ownerFullName, String ccvCode, double balance) {
        this.number = number;
        this.ownerFullName = ownerFullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double value) {
        balance += value;

    }

    public void takeOutMoney(double value) {
        try {
            balance -= value;
            if (balance < 0) {
                throw new NotEnoughFundsException("Out of balance");
            }
        } catch (NotEnoughFundsException e) {
            System.out.println(e);
        }
    }


}

package io.codelex.java_advanced_test.Exercise1;

public class CreditCard extends Card {


    public CreditCard(Integer number, String ownerFullName, String ccvCode, double balance) {
        super(number, ownerFullName, ccvCode, balance);
    }


    @Override
    public void takeOutMoney(double value) {
        super.takeOutMoney(value);
        if (getBalance() - value < 100) {
            System.out.println("Warning: Low funds");
        }
    }
}

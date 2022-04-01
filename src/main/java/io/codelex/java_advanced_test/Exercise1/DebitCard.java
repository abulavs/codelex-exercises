package io.codelex.java_advanced_test.Exercise1;

public class DebitCard extends Card {
    public DebitCard(Integer number, String ownerFullName, String ccvCode, double balance) {
        super(number, ownerFullName, ccvCode, balance);
    }


    @Override
    public void addMoney(double value) {
        super.addMoney(value);
        if (getBalance() + value > 10000) {
            System.out.println("Warning: Too much money");
        }
    }
}

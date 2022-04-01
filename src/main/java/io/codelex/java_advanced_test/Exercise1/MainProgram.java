package io.codelex.java_advanced_test.Exercise1;

public class MainProgram {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(234112, "Jānis Koks", "032", 1000);
        creditCard.takeOutMoney(999);

        DebitCard debitCard = new DebitCard(3423423, "Kārlis Miets", "211", 9000);
        debitCard.addMoney(2000);
    }
}

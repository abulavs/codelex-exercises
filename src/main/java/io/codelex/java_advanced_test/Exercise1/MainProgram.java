package io.codelex.java_advanced_test.Exercise1;

public class MainProgram {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard creditCard = new CreditCard(234112, "Jānis Koks", "032", 1000);
        creditCard.takeOutMoney(1000);

        DebitCard debitCard = new DebitCard(3423423, "Kārlis Miets", "211", 9000);
        debitCard.addMoney(1001);


        DebitCard debitCard2 = new DebitCard(121122, "Pēteris Zāle", "121", 1000);
        debitCard2.takeOutMoney(1001);

    }
}

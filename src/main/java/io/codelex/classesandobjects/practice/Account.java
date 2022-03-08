package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }

    public static void main(String[] args) {
        Account first = new Account("User",100);
        first.deposit(20);
        System.out.println(first.toString());
        System.out.println("++++++++++++++++++++++++++++++");

        Account user1 = new Account("Matt's account",1000);
        Account user2 = new Account("My account" ,0);

        user1.withdrawal(100);
        user2.deposit(100);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println("++++++++++++++++++++++++++++++");

        Account a = new Account("A",100);
        Account b = new Account("B",0);
        Account c = new Account("C",0);

        transfer(a,b,50);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("++++++++++++++++++++++++++++++");

        transfer(b,c,25);
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}

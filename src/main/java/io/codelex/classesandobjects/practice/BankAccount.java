package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        this.balance+=amount;
    }

    public final void withdraw(double amount) {
        this.balance-=amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        if (this.balance > 0) {
            return this.name + ", $" + String.format("%.2f",this.balance);
        } else {
            return this.name + ", -$" + String.format("%.2f",Math.abs(this.balance));
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("John Doe", 100);
        bankAccount.deposit(100);
        System.out.println(bankAccount.toString());
        System.out.println();
        bankAccount.withdraw(210);
        System.out.println(bankAccount.toString());
    }
}


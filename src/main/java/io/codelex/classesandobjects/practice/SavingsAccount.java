package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccount {
    double startBalance;
    double balanceInterest;
    int accountMonths;
    double depositBalance;
    double withdrawBalance;
    double interestBalance;

    public double getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(double startBalance) {
        this.startBalance = startBalance;
    }

    public void setBalanceInterest(double balanceInterest) {
        this.balanceInterest = balanceInterest;
    }

    public int getAccountMonths() {
        return accountMonths;
    }

    public void setAccountMonths(int accountMonths) {
        this.accountMonths = accountMonths;
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public double getWithdrawBalance() {
        return withdrawBalance;
    }

    public double getInterestBalance() {
        return interestBalance;
    }

    public void deposit(int value) {
        this.startBalance += value;
        this.depositBalance+=value;
    }

    public void withdrawn(int value) {
        this.startBalance -= value;
        this.withdrawBalance+=value;
    }

    public void addInterest(){
        this.interestBalance+=startBalance*(balanceInterest/12);
        this.startBalance += startBalance*(balanceInterest/12);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        Scanner input = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        savingsAccount.setStartBalance(input.nextInt());
        System.out.print("Enter the annual interest rate: ");
        savingsAccount.setBalanceInterest(input.nextInt());
        System.out.print("How long has the account been opened? ");
        savingsAccount.setAccountMonths(input.nextInt());
        int count = 1;
        do{
            System.out.print("Enter amount deposited for month: "+count+": ");
            savingsAccount.deposit(input.nextInt());
            System.out.print("Enter amount withdrawn for "+count+": ");
            savingsAccount.withdrawn(input.nextInt());
            savingsAccount.addInterest();
            count++;

        }while(!((count-1)==savingsAccount.getAccountMonths()));
        System.out.println("Total deposited: $"+String.format("%.2f",savingsAccount.getDepositBalance()));
        System.out.println("Total withdrawn: $"+String.format("%.2f",savingsAccount.getWithdrawBalance()));
        System.out.println("Interest earned: $"+String.format("%.2f",savingsAccount.getInterestBalance()));
        System.out.println("Total deposited: $"+String.format("%.2f",savingsAccount.getStartBalance()));
    }
}

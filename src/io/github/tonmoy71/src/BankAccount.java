package io.github.tonmoy71.src;

public class BankAccount {

    private double balance;

    public BankAccount(int i) {
        balance = i;
    }

    public void deposit(int value) {
        balance += value;
    }

    public void withdraw(int value) {
        balance -= value;
    }

    public double getBalance() {
        return balance;
    }

    public void calculateInterest(int balance) {
        this.balance = balance + balance * .15;
    }

    public void calculateMonthlyBalance(int balance, int month) {
        int monthlyBalance = balance / month;
    }
}

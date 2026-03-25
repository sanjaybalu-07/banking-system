package com.bank.model;

public class Withdrawal extends Transaction {

    public Withdrawal() {
        super("Withdrawal");
    }

    public void execute(Account acc, double amount) {
        acc.withdraw(amount);
    }
}
package com.bank.model;

public class Deposit extends Transaction {

    public Deposit() {
        super("Deposit");
    }

    public void execute(Account acc, double amount) {
        acc.deposit(amount);
    }
}
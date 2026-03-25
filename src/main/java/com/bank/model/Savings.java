package com.bank.model;

public class Savings extends Account {

    public Savings(String accNo) {
        super(accNo);
    }

    public void addInterest() {
        balance += balance * 0.05;
    }
}
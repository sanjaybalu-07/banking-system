package com.bank.model;

//saving module implementation
public class Savings extends Account {

    public Savings(String accNo) {
        super(accNo);
    }

    public void addInterest() {
        balance += balance * 0.05;
    }
}
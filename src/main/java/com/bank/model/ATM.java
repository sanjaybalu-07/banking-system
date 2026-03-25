package com.bank.model;

public class ATM {
    private String location;

    public ATM(String location) {
        this.location = location;
    }

    public void displayOptions() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
    }
}
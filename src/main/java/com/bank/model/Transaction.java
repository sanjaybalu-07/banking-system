package com.bank.model;

import java.util.Date;

//transaction module implementation
public class Transaction {
    private Date date;
    private String type;

    public Transaction(String type) {
        this.date = new Date();
        this.type = type;
    }

    public void printReceipt() {
        System.out.println("Transaction: " + type + " on " + date);
    }
}
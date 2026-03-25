package com.bank.model;

public class Customer {
    private String name;
    private String email;
    private String userId;

    public Customer(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public void deposit(Account acc, double amount) {
        acc.deposit(amount);
    }

    public void withdraw(Account acc, double amount) {
        acc.withdraw(amount);
    }
}
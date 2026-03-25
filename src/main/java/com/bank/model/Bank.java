package com.bank.model;

import java.util.*;

public class Bank {
    private String bankName;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void manageTransaction() {
        System.out.println("Managing transactions...");
    }
}
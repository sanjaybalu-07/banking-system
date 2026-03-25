package com.bank.main;

import com.bank.model.*;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("MyBank");

        Customer cust = new Customer("Sanjay", "sanjay@gmail.com", "U101");

        Account acc = new Savings("ACC1001");
        bank.addAccount(acc);

        ATM atm = new ATM("Chennai");

        atm.displayOptions();

        Deposit d = new Deposit();
        d.execute(acc, 1000);

        Withdrawal w = new Withdrawal();
        w.execute(acc, 300);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
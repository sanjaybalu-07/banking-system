package com.bank.main;

import com.bank.model.*;

public class Main {
    public static void main(String[] args) {

       // 🔹 Create Accounts
        Account acc1 = new Account("A101");
        Account acc2 = new Account("A102");

        // 🔹 Deposit Money
        acc1.deposit(1000);
        acc2.deposit(500);

        System.out.println("Initial Balances:");
        System.out.println("Account 1: " + acc1.getBalance());
        System.out.println("Account 2: " + acc2.getBalance());

        // 🔹 Withdraw Money
        acc1.withdraw(200);
        System.out.println("\nAfter Withdrawal from Account 1:");
        System.out.println("Account 1 Balance: " + acc1.getBalance());

        // 🔹 Transfer Money
        acc1.withdraw(300);
        acc2.deposit(300);

        Transaction t = new Transaction("Transfer");
        t.printReceipt();

        System.out.println("\nAfter Transfer:");
        System.out.println("Account 1 Balance: " + acc1.getBalance());
        System.out.println("Account 2 Balance: " + acc2.getBalance());

        // 🔹 Savings Account (Interest)
        Savings savings = new Savings("S101");
        savings.deposit(1000);
        savings.addInterest();

        System.out.println("\nSavings Account after Interest:");
        System.out.println("Savings Balance: " + savings.getBalance());

        // 🔹 Final Summary
        System.out.println("\n--- FINAL OUTPUT ---");
        System.out.println("Account 1 Final Balance: " + acc1.getBalance());
        System.out.println("Account 2 Final Balance: " + acc2.getBalance());
        System.out.println("Savings Final Balance: " + savings.getBalance());

        // 🔹 Keep container alive for demo (optional)
        try {
            Thread.sleep(10000); // 10 seconds
        } catch (InterruptedException e) {
        }
    }
}
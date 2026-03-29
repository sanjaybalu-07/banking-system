package com.bank.test;

import com.bank.model.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    // ✅ Test Case 1: Deposit Money
    @Test
    public void testDeposit() {
        Account acc = new Account("A101");
        acc.deposit(1000);
        assertEquals(1000, acc.getBalance(), 0);
    }

    // ✅ Test Case 2: Withdraw Money
    @Test
    public void testWithdraw() {
        Account acc = new Account("A102");
        acc.deposit(1000);
        acc.withdraw(400);
        assertEquals(600, acc.getBalance(), 0);
    }

    // ✅ Test Case 3: Withdraw with Insufficient Balance
    @Test
    public void testInsufficientBalance() {
        Account acc = new Account("A103");
        acc.deposit(300);
        acc.withdraw(500);

        // Balance should remain same
        assertEquals(300, acc.getBalance(), 0);
    }

    // ✅ Test Case 4: Transfer Between Accounts
    @Test
    public void testTransfer() {
        Account acc1 = new Account("A104");
        Account acc2 = new Account("A105");

        acc1.deposit(1000);

        // simulate transfer manually
        acc1.withdraw(200);
        acc2.deposit(200);

        Transaction t = new Transaction("Transfer");
        t.printReceipt();

        assertEquals(800, acc1.getBalance(), 0);
        assertEquals(200, acc2.getBalance(), 0);
    }

    // ✅ Test Case 5: Interest Calculation (Savings Account)
    @Test
    public void testInterest() {
        Savings acc = new Savings("A106");
        acc.deposit(1000);
        acc.addInterest();

        // Balance should increase after interest
        assertTrue(acc.getBalance() > 1000);
    }
}
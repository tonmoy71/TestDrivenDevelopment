package io.github.tonmoy71.test;

import io.github.tonmoy71.src.BankAccount;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tonmoy on 26-Mar-16.
 */
public class BankAccountTest {

    @Test
    public void testDeposit() throws Exception {
        BankAccount account = new BankAccount();
        account.deposit(50);
        assertEquals(account.getBalance(), 50, 0);
    }

    @Test
    public void testWithdraw() throws Exception {
        BankAccount account = new BankAccount(50);
        account.withdraw(30);
        assertEquals(account.getBalance(), 20, 0);
    }

    @Test
    public void testCalculateInterest() {
        BankAccount account = new BankAccount(100);
        account.calculateInterest(100);
        assertEquals(account.getBalance(), 115, 0);

    }

}
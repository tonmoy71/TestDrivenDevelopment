package io.github.tonmoy71.test;

import io.github.tonmoy71.src.BankAccount;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by tonmoy on 26-Mar-16.
 */
public class BankAccountTest {

    BankAccount account;

    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("beforeClass()");
    }

    @Before
    public void setUp() {
        account = new BankAccount(100);
        System.out.println("setup()");
    }


    @Test
    public void testDeposit() throws Exception {
        account.deposit(50);
        assertEquals(account.getBalance(), 150, 0);
    }

    @Test
    public void testWithdraw() throws Exception {
        account.withdraw(30);
        assertEquals(account.getBalance(), 70, 0);
    }

    @Test
    public void testCalculateInterest() {
        account.calculateInterest(100);
        assertEquals(account.getBalance(), 115, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateMonthlyBalance() {
        account.calculateMonthlyBalance(100, 0);
    }

    @After
    public void tearDown()
    {
        account = null;
        System.out.println("tearDown()");
    }


    @AfterClass
    public static void afterClass()
    {
        System.out.println("afterClass()");
    }
}
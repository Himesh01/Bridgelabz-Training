package jUnit.AdvancedJUnitPracticeProblems.TestingBankingTransactions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(1000);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(2000);
        });
    }
}
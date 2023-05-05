package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    @Test
    public void testGetCashMachine() {
        Bank bank = new Bank(3);
        assertNotNull(bank.getCashMachine(0));
        assertNotNull(bank.getCashMachine(1));
        assertNotNull(bank.getCashMachine(2));
    }
    @Test
    public void testGetNumCashMachines() {
    Bank bank = new Bank(3);
    assertEquals(3, bank.getNumCashMachines());
    }

    @Test
    public void testGetTotalBalance() {
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = bank.getCashMachine(0);
        CashMachine cashMachine2 = bank.getCashMachine(1);
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(-50);
        cashMachine1.addTransaction(20);
        assertEquals(70, bank.getTotalBalance());
    }
    @Test
    public void testGetWithdrawalTransactionCount(){
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = bank.getCashMachine(0);
        CashMachine cashMachine2 = bank.getCashMachine(1);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(-50);
        cashMachine1.addTransaction(20);
        assertEquals(2, bank.getWithdrawalTransactionCount());


    }
    @Test
    public void testGetDepositTransactionCount(){
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = bank.getCashMachine(0);
        CashMachine cashMachine2 = bank.getCashMachine(1);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(-50);
        cashMachine1.addTransaction(20);
        assertEquals(1, bank.getDepositTransactionCount());
    }
@Test
    public void testGetAverageWithdrawal(){
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = bank.getCashMachine(0);
        CashMachine cashMachine2 = bank.getCashMachine(1);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(-50);
        cashMachine1.addTransaction(20);
        assertEquals(75, bank.getAverageWithdrawal());
    }
    @Test
    public void testGetAverageDeposit(){
        Bank bank = new Bank(2);
        CashMachine cashMachine1 = bank.getCashMachine(0);
        CashMachine cashMachine2 = bank.getCashMachine(1);
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(100);
        cashMachine1.addTransaction(100);
        assertEquals(100, bank.getAverageDeposit());

    }
}

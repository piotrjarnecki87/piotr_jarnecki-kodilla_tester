package com.kodilla.bank.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashMachineTest {
    @Test
    public void testAddTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(20);
        int[] expectedTransactions = {100, -50, 20};
        Assertions.assertArrayEquals(expectedTransactions, cashMachine.getTransactions());
    }

    @Test
    public void testGetBalance(){
        CashMachine cashMachine =new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(20);

        int expectedBalance = 70;
        Assertions.assertEquals(expectedBalance, cashMachine.getBalance());
    }
    @Test
    public void testGetTransactionCount(){
        CashMachine cashMachine =new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(20);

        Assertions.assertEquals(3, cashMachine.getTransactionCount(), 0.01);
    }
}

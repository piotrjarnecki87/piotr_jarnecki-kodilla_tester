package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(int numCashMachines) {
        this.cashMachines = new CashMachine[numCashMachines];
        for (int i = 0; i < numCashMachines; i++) {
            this.cashMachines[i] = new CashMachine();
        }
    }
    public CashMachine getCashMachine(int index) {
        return this.cashMachines[index];
    }

    public int getNumCashMachines() {
        return this.cashMachines.length;
    }
    public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }
    public int getWithdrawalTransactionCount() {
        int withdrawalCount = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    withdrawalCount++;
                }
            }
        }
        return withdrawalCount;
    }

    public int getDepositTransactionCount() {
        int depositCount = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    depositCount++;
                }
            }
        }
        return depositCount;
    }

    public double getAverageWithdrawal() {
        int withdrawalCount = 0;
        int withdrawalTotal = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    withdrawalCount++;
                    withdrawalTotal += Math.abs(transaction);
                }
            }
        }
        return withdrawalCount == 0 ? 0 : (double) withdrawalTotal / withdrawalCount;
    }

    public double getAverageDeposit() {
        int depositCount = 0;
        int depositTotal = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    depositCount++;
                    depositTotal += transaction;
                }
            }
        }
        return depositCount == 0 ? 0 : (double) depositTotal / depositCount;
    }

}

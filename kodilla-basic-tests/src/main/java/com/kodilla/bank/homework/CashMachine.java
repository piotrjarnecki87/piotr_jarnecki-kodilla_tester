package com.kodilla.bank.homework;

public class CashMachine {
        private int[] transactions;
        private  int balance = 0;

        public CashMachine() {
                this.transactions = new int[0];
        }

        public void addTransaction(int amount) {
                int[] newTransactions = new int[this.transactions.length + 1];
                System.arraycopy(this.transactions, 0, newTransactions, 0, this.transactions.length);
                newTransactions[newTransactions.length - 1] = amount;
                this.transactions = newTransactions;
        }

        public int getBalance() {
                for (int transaction : this.transactions) {
                        this.balance += transaction;
                }
                return this.balance;
        }
        public int getTransactionCount() {
                return this.transactions.length;
        }
        public int[] getTransactions() {
                return this.transactions;
        }
}


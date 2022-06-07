package com.kodilla.homework;

public class CashMachine {
    private int[] transactionsOfCashMachine;

    public CashMachine(int[] transactionsOfCashMachine) {
        this.transactionsOfCashMachine = transactionsOfCashMachine;
    }

    public int getCashMachineBalance() {
        int sum = 0;
        for (int i = 0; i < transactionsOfCashMachine.length; i++) {
            sum = sum + transactionsOfCashMachine[i];
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return transactionsOfCashMachine.length;
    }

    public int getNumberOfWithdrawalTransactionsFromOneCashMachine() {
        int counter = 0;
        for (int i = 0; i < transactionsOfCashMachine.length; i++) {
            if (transactionsOfCashMachine[i] >= 0)
                continue;
            counter++;
        }
        return counter;
    }

    public int getNumberOfDepositTransactionsFromOneCashMachine() {
        int counter = 0;
        for (int i = 0; i < transactionsOfCashMachine.length; i++) {
            if (transactionsOfCashMachine[i] <= 0)
                continue;
            counter++;
        }
        return counter;
    }

    public double getTotalValueOfAllWithdrawalTransactionsFromOneCashMachine() {
        int totalValueOfAllWithdrawalTransactions = 0;
        for (int i = 0; i < transactionsOfCashMachine.length; i++) {
            if (transactionsOfCashMachine[i] >= 0)
                continue;
            totalValueOfAllWithdrawalTransactions += transactionsOfCashMachine[i];
        }
        return totalValueOfAllWithdrawalTransactions;
    }

    public double getAverageValueOfWithdrawalTransactionsFromOneCashMachine() {
        if (this.getNumberOfWithdrawalTransactionsFromOneCashMachine() == 0) {
            return 0;
        }
        return this.getTotalValueOfAllWithdrawalTransactionsFromOneCashMachine()
                /this.getNumberOfWithdrawalTransactionsFromOneCashMachine();
    }

    public double getTotalValueOfAllDepositTransactionsFromOneCashMachine() {
        int totalValueOfAllDepositTransactions = 0;
        for (int i = 0; i < transactionsOfCashMachine.length; i++) {
            if (transactionsOfCashMachine[i] <= 0)
                continue;
            totalValueOfAllDepositTransactions += transactionsOfCashMachine[i];
        }
        return totalValueOfAllDepositTransactions;
    }
    public double getAverageValueOfDepositTransactionsFromOneCashMachine() {
        if (this.getNumberOfDepositTransactionsFromOneCashMachine() == 0) {
            return 0;
        }
        return this.getTotalValueOfAllDepositTransactionsFromOneCashMachine()
                /this.getNumberOfDepositTransactionsFromOneCashMachine();
    }

    public int[] getTransactionsOfCashMachine() {
        return transactionsOfCashMachine;
    }

    public void displayTransactionsOfCashMachine() {
        for (int i = 0; i < transactionsOfCashMachine.length; i++) {
            System.out.println(transactionsOfCashMachine[i]);
        }
    }
}

package com.kodilla.homework;

public class Bank {
    private CashMachine[] cashMachinesArray;

    public Bank(CashMachine[] cashMachinesArray) {
        this.cashMachinesArray = cashMachinesArray;
    }

    public int getBalanceOfAllCashMachines() {
        int sum = 0;
        for (int j = 0; j < cashMachinesArray.length; j++) {
            sum = sum + cashMachinesArray[j].getCashMachineBalance();
        }
        return sum;
    }

    public int getNumberOfWithdrawalTransactionsFromAllCashMachines() {
        int counter = 0;
        for (int i = 0; i < cashMachinesArray.length; i++) {
            counter = counter + cashMachinesArray[i].getNumberOfWithdrawalTransactionsFromOneCashMachine();
        }
        return counter;
    }

    public int getNumberOfDepositTransactionsFromAllCashMachines(){
        int counter = 0;
        for (int i = 0; i < cashMachinesArray.length; i++) {
            counter = counter + cashMachinesArray[i].getNumberOfDepositTransactionsFromOneCashMachine();
        }
        return counter;
    }

    public double getTotalValueOfAllWithdrawalTransactionsFromAllCashMachines() {
        int totalValueOfAllWithdrawalTransactionsFromAllCashMachines = 0;
        for (int i = 0; i < cashMachinesArray.length; i++) {
            if (cashMachinesArray[i].getTotalValueOfAllWithdrawalTransactionsFromOneCashMachine() >= 0)
                continue;
            totalValueOfAllWithdrawalTransactionsFromAllCashMachines +=
                    cashMachinesArray[i].getTotalValueOfAllWithdrawalTransactionsFromOneCashMachine();
        }
        return totalValueOfAllWithdrawalTransactionsFromAllCashMachines;
    }

    public double getAverageValueOfWithdrawalTransactionsFromAllCashMachines() {
        if (this.getNumberOfWithdrawalTransactionsFromAllCashMachines() == 0) {
            return 0;
        }
        return this.getTotalValueOfAllWithdrawalTransactionsFromAllCashMachines()
                /this.getNumberOfWithdrawalTransactionsFromAllCashMachines();
    }

    public double getTotalValueOfAllDepositTransactionsFromAllCashMachines() {
        int totalValueOfAllDepositTransactionsFromAllCashMachines = 0;
        for (int i = 0; i < cashMachinesArray.length; i++) {
            if (cashMachinesArray[i].getTotalValueOfAllDepositTransactionsFromOneCashMachine() <= 0)
                continue;
            totalValueOfAllDepositTransactionsFromAllCashMachines +=
                    cashMachinesArray[i].getTotalValueOfAllDepositTransactionsFromOneCashMachine();
        }
        return totalValueOfAllDepositTransactionsFromAllCashMachines;
    }

    public double getAverageValueOfDepositTransactionsFromAllCashMachines() {
        if (this.getNumberOfDepositTransactionsFromAllCashMachines() == 0) {
            return 0;
        }
        return this.getTotalValueOfAllDepositTransactionsFromAllCashMachines()
                /this.getNumberOfDepositTransactionsFromAllCashMachines();
    }

}
    /*
    Utwórz klasę Bank, która będzie zawierać tablicę bankomatów. Bank powinien mieć metody zwracające:

całkowity bilans ze wszystkich bankomatów,
liczbę transakcji związanych z wypłatą,
liczbę transakcji związaną z wpłatą pieniędzy,
średnią wartość wypłaty,
średnią wartość wpłaty.
Napisz odpowiednie testy, aby pokryć typowe sytuacje, jak i przypadki brzegowe.
     */

package com.kodilla.homework;

public class Application {

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300});
        System.out.println(cashMachine.getCashMachineBalance());
        System.out.println(cashMachine.getNumberOfTransactions());
        System.out.println(cashMachine.getNumberOfDepositTransactionsFromOneCashMachine());
        System.out.println(cashMachine.getNumberOfWithdrawalTransactionsFromOneCashMachine());
        System.out.println(cashMachine.getTotalValueOfAllWithdrawalTransactionsFromOneCashMachine());
        System.out.println(cashMachine.getAverageValueOfWithdrawalTransactionsFromOneCashMachine());
        System.out.println(cashMachine.getTotalValueOfAllDepositTransactionsFromOneCashMachine());
        System.out.println(cashMachine.getAverageValueOfDepositTransactionsFromOneCashMachine());
        System.out.println();

        CashMachine cashMachine1 = new CashMachine(new int[]{3000, 5000, 2000, -1000, 4000, 500});
        System.out.println(cashMachine1.getCashMachineBalance());
        System.out.println(cashMachine1.getNumberOfTransactions());
        System.out.println();

        CashMachine cashMachine2 = new CashMachine(new int[]{1000, 500, 2000, -400});
        System.out.println(cashMachine2.getCashMachineBalance());
        System.out.println(cashMachine2.getNumberOfTransactions());
        System.out.println();

        CashMachine[] cashMachinesArray = new CashMachine[]{
                cashMachine,
                cashMachine1,
                cashMachine2,
        };

        Bank bank = new Bank(cashMachinesArray);
        System.out.println(bank.getBalanceOfAllCashMachines());
        System.out.println(bank.getNumberOfDepositTransactionsFromAllCashMachines());
        System.out.println(bank.getNumberOfWithdrawalTransactionsFromAllCashMachines());
        System.out.println(bank.getTotalValueOfAllWithdrawalTransactionsFromAllCashMachines());
        System.out.println(bank.getAverageValueOfWithdrawalTransactionsFromAllCashMachines());
        System.out.println(bank.getTotalValueOfAllDepositTransactionsFromAllCashMachines());
        System.out.println(bank.getAverageValueOfDepositTransactionsFromAllCashMachines());
        System.out.println();

        cashMachine.displayTransactionsOfCashMachine();
        System.out.println();

        cashMachine1.displayTransactionsOfCashMachine();
        System.out.println();

        cashMachine2.displayTransactionsOfCashMachine();
    }
}

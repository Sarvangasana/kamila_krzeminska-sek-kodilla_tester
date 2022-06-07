package com.kodilla.bank.homework;

import com.kodilla.homework.Bank;
import com.kodilla.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    // getBalanceOfAllCashMachines()
    @Test
    public void testGetBalanceOfAllCashMachinesIfThereAreThreeNotEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300});
        CashMachine cashMachine1 = new CashMachine(new int[]{3000, 5000, 2000, -1000, 4000, 500});
        CashMachine cashMachine2 = new CashMachine(new int[]{1000, 500, 2000, -400});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        int getBalanceOfAllCashMachinesResult = bank.getBalanceOfAllCashMachines();
        assertEquals(23800, getBalanceOfAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetBalanceOfAllCashMachinesIfThereIsOneNotEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getBalanceOfAllCashMachinesResult = bank.getBalanceOfAllCashMachines();
        assertEquals(7200, getBalanceOfAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetBalanceOfAllCashMachinesIfThereIsOneEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getBalanceOfAllCashMachinesResult = bank.getBalanceOfAllCashMachines();
        assertEquals(0, getBalanceOfAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetBalanceOfAllCashMachinesIfThereAreThreeEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine cashMachine1 = new CashMachine(new int[]{});
        CashMachine cashMachine2 = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        int getBalanceOfAllCashMachinesResult = bank.getBalanceOfAllCashMachines();
        assertEquals(0, getBalanceOfAllCashMachinesResult, 0.001);
    }

    // getNumberOfWithdrawalTransactionsFromAllCashMachines()

    @Test
    public void testGetNumberOfWithdrawalTransactionsFromAllCashMachinesIfThereAreThreeNotEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{500, 100, 2000, 5000, -4000});
        CashMachine cashMachine1 = new CashMachine(new int[]{6000, -2500, -100, -400});
        CashMachine cashMachine2 = new CashMachine(new int[]{300, -4000, 2000});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfWithdrawalTransactionsFromAllCashMachinesResult = bank.getNumberOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(5, getNumberOfWithdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfWithdrawalTransactionsFromAllCashMachinesIfThereIsOneNotEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{6000, -2500, -100, -400});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfWithdrawalTransactionsFromAllCashMachinesResult = bank.getNumberOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(3, getNumberOfWithdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfWithdrawalTransactionsFromAllCashMachinesIfThereIsOneEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfWithdrawalTransactionsFromAllCashMachinesResult = bank.getNumberOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(0, getNumberOfWithdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfWithdrawalTransactionsFromAllCashMachinesIfThereAreThreeEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine cashMachine1 = new CashMachine(new int[]{});
        CashMachine cashMachine2 = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfWithdrawalTransactionsFromAllCashMachinesResult = bank.getNumberOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(0, getNumberOfWithdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfWithdrawalTransactionsFromAllCashMachinesIfThereIsOneCashMachineWithDepositsOnly() {
        CashMachine cashMachine = new CashMachine(new int[]{3000, 300, 100, 2000});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfWithdrawalTransactionsFromAllCashMachinesResult = bank.getNumberOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(0, getNumberOfWithdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    // getNumberOfDepositTransactionsFromAllCashMachines()
    @Test
    public void testGetNumberOfDepositTransactionsFromAllCashMachinesIfThereAreThreeNotEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300, 2000, 400});
        CashMachine cashMachine1 = new CashMachine(new int[]{3000, 5000, 2000, -1000, 4000, 500, 100});
        CashMachine cashMachine2 = new CashMachine(new int[]{1000, 500, 2000, -400, 30});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfDepositTransactionsFromAllCashMachinesResult = bank.getNumberOfDepositTransactionsFromAllCashMachines();
        assertEquals(16, getNumberOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfDepositTransactionsFromAllCashMachinesIfThereAreThreeEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine cashMachine1 = new CashMachine(new int[]{});
        CashMachine cashMachine2 = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfDepositTransactionsFromAllCashMachinesResult = bank.getNumberOfDepositTransactionsFromAllCashMachines();
        assertEquals(0, getNumberOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfDepositTransactionsFromAllCashMachinesIfThereIsOneNotEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{-2000, 300, 100, 2000});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfDepositTransactionsFromAllCashMachinesResult = bank.getNumberOfDepositTransactionsFromAllCashMachines();
        assertEquals(3, getNumberOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfDepositTransactionsFromAllCashMachinesIfThereIsOneEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfDepositTransactionsFromAllCashMachinesResult = bank.getNumberOfDepositTransactionsFromAllCashMachines();
        assertEquals(0, getNumberOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetNumberOfDepositTransactionsFromAllCashMachinesIfThereIsOneCashMachineWithWithdrawalsOnly() {
        CashMachine cashMachine = new CashMachine(new int[]{-2000, -300, -100, -2000});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        int getNumberOfDepositTransactionsFromAllCashMachinesResult = bank.getNumberOfDepositTransactionsFromAllCashMachines();
        assertEquals(0, getNumberOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    // getAverageValueOfWithdrawalTransactionsFromAllCashMachines()

    @Test
    public void testGetAverageValueOfWithdrawalTransactionsFromAllCashMachinesIfThereAreThreeNotEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300, 2000, 400});
        CashMachine cashMachine1 = new CashMachine(new int[]{3000, 5000, 2000, -1000, 4000, 500, 100});
        CashMachine cashMachine2 = new CashMachine(new int[]{1000, 500, 2000, -400, 30});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult = bank.getAverageValueOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(-675, getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfWithdrawalTransactionsFromAllCashMachinesIfThereIsOneNotEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300, 2000, 400});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult = bank.getAverageValueOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(-650, getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfWithdrawalTransactionsFromAllCashMachinesIfThereAreThreeEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine cashMachine1 = new CashMachine(new int[]{});
        CashMachine cashMachine2 = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult = bank.getAverageValueOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(0, getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfWithdrawalTransactionsFromAllCashMachinesIfThereIsOneEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult = bank.getAverageValueOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(0, getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfWithdrawalTransactionsFromAllCashMachinesIfThereIsOneCashMachineWithDepositsOnly() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, 200, 2000, 400});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult = bank.getAverageValueOfWithdrawalTransactionsFromAllCashMachines();
        assertEquals(0, getAverageValueOfWitdrawalTransactionsFromAllCashMachinesResult, 0.001);
    }

    // getAverageValueOfDepositTransactionsFromAllCashMachines()

    @Test
    public void testGetAverageValueOfDepositTransactionsFromAllCashMachinesIfThereAreThreeNotEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, 1000, 500, -1000, 2000, -300, 2000, 400});
        CashMachine cashMachine1 = new CashMachine(new int[]{3000, 5000, 2000, -1000, 4000, 500, 100});
        CashMachine cashMachine2 = new CashMachine(new int[]{1000, 500, 2000, -400, 30});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine, cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfDepositTransactionsFromAllCashMachinesResult = bank.getAverageValueOfDepositTransactionsFromAllCashMachines();
        assertEquals(1814.375, getAverageValueOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
        public void testGetAverageValueOfDepositTransactionsFromAllCashMachinesIfThereIsOneNotEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{5000, -1000, 500, -200, 2000, 400});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfDepositTransactionsFromAllCashMachinesResult = bank.getAverageValueOfDepositTransactionsFromAllCashMachines();
        assertEquals(1975, getAverageValueOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfDepositTransactionsFromAllCashMachinesIfThereIsOneEmptyCashMachine() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfDepositTransactionsFromAllCashMachinesResult = bank.getAverageValueOfDepositTransactionsFromAllCashMachines();
        assertEquals(0, getAverageValueOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfDepositTransactionsFromAllCashMachinesIfThereAreThreeEmptyCashMachines() {
        CashMachine cashMachine = new CashMachine(new int[]{});
        CashMachine cashMachine1 = new CashMachine(new int[]{});
        CashMachine cashMachine2 = new CashMachine(new int[]{});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,cashMachine1, cashMachine2,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfDepositTransactionsFromAllCashMachinesResult = bank.getAverageValueOfDepositTransactionsFromAllCashMachines();
        assertEquals(0, getAverageValueOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }

    @Test
    public void testGetAverageValueOfDepositTransactionsFromAllCashMachinesIfThereIsOneCashMachineWithWithdrawalsOnly() {
        CashMachine cashMachine = new CashMachine(new int[]{-5000, -1000, -500, -200, -2000, -400});
        CashMachine[] cashMachinesArray = new CashMachine[]{cashMachine,};
        Bank bank = new Bank(cashMachinesArray);
        double getAverageValueOfDepositTransactionsFromAllCashMachinesResult = bank.getAverageValueOfDepositTransactionsFromAllCashMachines();
        assertEquals(0, getAverageValueOfDepositTransactionsFromAllCashMachinesResult, 0.001);
    }
}
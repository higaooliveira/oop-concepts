package com.higor.heranca;

public class Main {

    public static void main(String[] args) {
        Account johnAccount = new CheckingAccount(15646, "John Doe", 15000.00);
        Account anneAccount = new CheckingAccount(10000, "Anne Doe", 100.00);

        johnAccount.deposit(1000.00);
        johnAccount.withdraw(5000.00);
        johnAccount.transfer(anneAccount, 5000.00);

        Account savingAccount = new SavingAccount(15646, "John Doe", 10000.00);

        savingAccount.deposit(5000.00);
        savingAccount.withdraw(5000.00);

    }
}

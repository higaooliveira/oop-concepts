package com.higor.heranca;

abstract class Account {
    private int number;
    private String holder;
    private Double balance;

    public Account(int number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(Double balance) {
        System.out.println("Valor da conta do " + this.getHolder() +" antes de depósito: R$" + this.getBalance() + "\n");
        this.balance += balance;
        System.out.println("Valor da conta do " + this.getHolder() +" depois do depósito: R$" + this.getBalance() + "\n");
    }

    protected boolean canWithdrawOrTransfer(Double amount) {
        return amount > this.getBalance();
    }

    abstract void transfer(Account account, Double amount);

    abstract public Double withdraw(Double amount);

    abstract public Double calculateNewBalance(Double amount);
}

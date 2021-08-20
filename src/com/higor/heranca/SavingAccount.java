package com.higor.heranca;

public class SavingAccount extends Account{

    public SavingAccount(int number, String holder, Double balance) {
        super(number, holder, balance);
    }

    @Override
    void transfer(Account account, Double amount) {
        if (this.canWithdrawOrTransfer(amount)) {
            throw new RuntimeException("You can't transfer this amount");
        }
        System.out.println("Valor da conta do " + this.getHolder() +" antes da transferência: R$" + this.getBalance() + "\n");
        System.out.println("Valor da conta da " + account.getHolder() +" antes da transferência: R$" + account.getBalance() + "\n");

        Double newBalance = this.calculateNewBalance(amount);
        this.setBalance(newBalance);
        account.deposit(amount);

        System.out.println("Valor da conta do " + this.getHolder() +" depois da transferência: R$" + this.getBalance() + "\n");
        System.out.println("Valor da conta da " + account.getHolder() +" depois da transferência: R$" + account.getBalance() + "\n");
    }

    @Override
    public Double withdraw(Double amount) {
        if (this.canWithdrawOrTransfer(amount)) {
            throw new RuntimeException("You can't withdraw this amount");
        }
        System.out.println("Valor da conta do " + this.getHolder() + " antes do saque: R$" + this.getBalance() + "\n");

        Double newBalance = this.calculateNewBalance(amount);
        this.setBalance(newBalance);

        System.out.println("Valor da conta do " + this.getHolder() + " depois do saque: R$" + this.getBalance() + "\n");

        return amount;
    }

    @Override
    public Double calculateNewBalance(Double amount) {
        Double tax = 0.05;
        System.out.println("Aplicando taxa de 5%");
        return this.getBalance() - amount - (amount * tax);
    }
}

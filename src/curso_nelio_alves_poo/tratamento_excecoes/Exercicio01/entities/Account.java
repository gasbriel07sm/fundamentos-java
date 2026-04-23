package curso_nelio_alves_poo.tratamento_excecoes.Exercicio01.entities;

import curso_nelio_alves_poo.tratamento_excecoes.Exercicio01.exceptions.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private Double withdrawLimit;

    public Account(Integer number, String holder, double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        deposit(balance);
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new AccountException("The amount exceeds withdraw limit");
        }
        else if (amount > balance) {
            throw new AccountException("Not enough balance");
        }
        else {
            balance -= amount;
        }
    }

}

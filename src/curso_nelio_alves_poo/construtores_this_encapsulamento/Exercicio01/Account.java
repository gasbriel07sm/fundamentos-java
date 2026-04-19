package curso_nelio_alves_poo.construtores_this_encapsulamento.Exercicio01;

public class Account {

    private int numberAccount;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int numberAccount, String holder, double balance) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        deposit(balance);
    }

    public Account(int numberAccount, String holder) {
        this.numberAccount = numberAccount;
        this.holder = holder;
        balance = 2000.50;
    }

    public int getNumberAccount() {
        return numberAccount;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= (amount + 5);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return  "Account " + numberAccount
                + ", Holder: " + holder
                + ", Balance: $ " + String.format("%.2f", balance);
    }
}

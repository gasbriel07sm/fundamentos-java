package reforco_poo.lista01.bloco06;

public class Wallet {

    private String id;
    private String holderName;
    private double balance;

    public Wallet(String id, String holderName, double balanceInitial) {
        this.id = id;
        this.holderName = holderName;
        deposit(balanceInitial);
    }

    public Wallet(String id, String holderName) {
        this.id = id;
        this.holderName = holderName;
        this.balance = 0;

    }

    public String getId() {
        return id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println(holderName + " withdraw failed: insufficient balance.");
        }
    }

    public void transfer(Wallet target, double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.withdraw(amount);
            target.deposit(amount);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(holderName + ": $ " + String.format("%.2f", this.balance));

        return sb.toString();
    }
}

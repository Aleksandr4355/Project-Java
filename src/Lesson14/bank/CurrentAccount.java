package Lesson14.bank;

public class CurrentAccount implements Account{
    private double balance;
    private  double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawn(double amount) {
        if (balance + overdraftLimit >= amount)
        balance -= amount;
        else
            System.out.println("Недостточно средств");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

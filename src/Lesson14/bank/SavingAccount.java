package Lesson14.bank;

public class SavingAccount implements Account{
    private  double balance;
    private  double interestRate;

    public SavingAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawn(double amount) {
        balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void appLyInterest(){
        balance += balance * interestRate / 100;
    }
}

package Lesson14.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount savingAccount = new SavingAccount(1000,1.25);
        System.out.println("======== Сберегателньй счет ========\nПервоночальный депозит: $" + savingAccount.getBalance() + "\nПроцентная ставка: " + savingAccount.getInterestRate() + "%");

        CurrentAccount currentAccount = new CurrentAccount(5000,1000);
        System.out.println("\n======== Текущий счет ========\nПервоночальный депозит: $" + currentAccount.getBalance() + "\nЛимит овердрафта: $" + currentAccount.getOverdraftLimit());

        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nВносим 100 долларов на сберегательный счет.");
        bank.deposit(savingAccount,100);

        System.out.println("\nВносим 500 долларов на текущий счет.");
        bank.deposit(currentAccount,500);

        System.out.println("\n==== Сберегательный и текущий  счет ====");
        bank.printAccountBalances();

        System.out.println("\n нрп+Cнимаем 150 долларов со сберегательного счета");
        bank.withdraw(savingAccount,150);

        System.out.println("Cнимаем 150 долларов со сберегательного счета");
        bank.withdraw(currentAccount,1500);

        System.out.println("\n==== Сберегательный и текущий  счет ====");
        bank.printAccountBalances();


        savingAccount.appLyInterest(); // начесление процентов
        System.out.print("\nПосле начесления процентов");

        System.out.println("\n==== Сберегательный и текущий  счет ====");
        bank.printAccountBalances();

    }
}

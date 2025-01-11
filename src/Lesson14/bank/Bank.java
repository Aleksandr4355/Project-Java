package Lesson14.bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts; // при создание списка (массива) в тип данных указан <название класса интерфейса>

    public Bank() {
        this.accounts = new ArrayList<>(); // в конструкторе к перемменой создаем список.
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void deposit(Account account, double amount){
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount){
        account.withdrawn(amount);
    }

    public void printAccountBalances(){
        for (Account account : accounts){
            System.out.println("Баланс счета: " + account.getBalance());
        }
    }
}

package com.assignment.abstractclass;


abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double balance;

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawal successful");
    }
}
public class AssignmentThree {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(400);
        savingsAccount.withdraw(500);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(2000);
        currentAccount.withdraw(1000);
    }
}

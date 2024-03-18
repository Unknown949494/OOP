package oop.labor04_2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public void BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

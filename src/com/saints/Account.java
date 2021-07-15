package com.saints;

public class Account {
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount){

        if(balance < withdrawAmount || withdrawAmount < 0){
            System.out.println("You cannot proceed with current balance");
            displayBalance();
            return;
        }

        balance -= withdrawAmount;
        System.out.println("Withdrawn: " + withdrawAmount);
        displayBalance();
    }

    public void charge(double chargeAmount, Account sender){
        if(chargeAmount < 0 || chargeAmount > sender.balance){
            System.out.println("Cannot proceed with current balance");
            return;
        }
        System.out.println(accountNumber + " Received: " + chargeAmount);
        balance += chargeAmount;
        sender.balance -= chargeAmount;
        sender.displayBalance();
    }

    public void deposit(double depositAmount){


        if(depositAmount < 0)
            return;

        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
        displayBalance();
    }

    public void displayBalance(){
        System.out.println("Current balance: " + balance);
    }
}


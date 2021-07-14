package com.saints;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Account> accounts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Account currentAccount;

    public Bank() {
        accounts.add(new Account(1111, 1234, 200));
        accounts.add(new Account(1211, 1235, 20));
        accounts.add(new Account(1311, 1236, 2000));
    }

    public void signOut(){
        System.out.println("Signed out successfully");
        currentAccount = null;
    }

    public void signIn(){
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter pin number:");
        int pin = scanner.nextInt();
        currentAccount = searchByAccountNumber(accountNumber);

        if (currentAccount == null){
            System.out.println("Incorrect login data");
            return;
        }

        checkPin(currentAccount, pin);
        }

    public Account getCurrentAccount(){
        return currentAccount;
    }

    public void transfer(int receiverNumber) {
        Account receiver = searchByAccountNumber(receiverNumber);

        if(receiver == null)
            return;
        System.out.println("Enter amount to transfer");
        receiver.charge(scanner.nextDouble());

    }

    private void checkPin(Account account, int pin){
        if (account.getPin() == pin)
            System.out.println("Logged In");
        else{
            System.out.println("Incorrect login data");
            currentAccount = null;
        }
    }

    private Account searchByAccountNumber(int accountNumber){
        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber)
                return account;
        }
        return null;
    }
}

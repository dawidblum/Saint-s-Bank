package com.saints.interfaceStates;

import com.saints.Account;
import com.saints.Bank;

public class LoggedInState extends InterfaceState{
    private Account account;
    private Bank bank;

    public LoggedInState(BankSystemManagement bankSystemManagement) {
        super(bankSystemManagement);
        bank = bankSystemManagement.getBank();
        account = bank.getCurrentAccount();
    }

    @Override
    public void displayOptions() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Balance");
        System.out.println("5. Logout");
    }

    @Override
    public void userInteraction() {
        userChoice = scanner.nextInt();

        switch (userChoice){
            case 1 -> {
                System.out.println("Enter amount to deposit: ");
                account.deposit(scanner.nextDouble());
            }
            case 2 -> {
                System.out.println("Enter amount to withdraw: ");
                account.withdraw(scanner.nextDouble());
            }
            case 3 -> {
                System.out.println("Enter receiver number");
                bank.transfer(scanner.nextInt());
            }
            case 4 -> account.displayBalance();
            case 5 -> bank.signOut();
        }
    }
}

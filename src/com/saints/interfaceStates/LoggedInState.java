package com.saints.interfaceStates;

import com.saints.Bank;

public class LoggedInState extends InterfaceState{
    public LoggedInState(Bank bank) {
        super(bank);
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

    }
}

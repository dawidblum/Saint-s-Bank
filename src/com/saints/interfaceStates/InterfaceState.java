package com.saints.interfaceStates;

import com.saints.Bank;

import java.util.Scanner;

public abstract class InterfaceState {
    protected Scanner scanner = new Scanner(System.in);
    protected Bank bank;
    protected int userChoice;

    public InterfaceState(Bank bank) {
        this.bank = bank;
    }

    public abstract void displayOptions();
    public abstract void userInteraction();
}

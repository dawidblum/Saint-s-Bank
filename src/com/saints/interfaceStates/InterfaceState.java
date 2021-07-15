package com.saints.interfaceStates;

import com.saints.Bank;

import java.util.Scanner;

public abstract class InterfaceState {
    protected Scanner scanner = new Scanner(System.in);
    protected BankSystemManagement bankSystemManagement;
    protected int userChoice;

    public InterfaceState(BankSystemManagement bankSystemManagement) {
        this.bankSystemManagement = bankSystemManagement;
    }

    public abstract void displayOptions();
    public abstract void userInteraction();
}

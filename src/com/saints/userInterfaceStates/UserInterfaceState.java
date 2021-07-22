package com.saints.userInterfaceStates;

import com.saints.BankSystemManagement;

import java.util.Scanner;

public abstract class UserInterfaceState {
    protected Scanner scanner = new Scanner(System.in);
    protected BankSystemManagement bankSystemManagement;
    protected int userChoice;

    public UserInterfaceState(BankSystemManagement bankSystemManagement) {
        this.bankSystemManagement = bankSystemManagement;
    }

    public abstract void displayOptions();
    public abstract void userInteraction();
}

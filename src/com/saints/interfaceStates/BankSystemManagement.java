package com.saints.interfaceStates;

import com.saints.Bank;

import java.util.Scanner;

public class BankSystemManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final Bank bank = new Bank();
    private InterfaceState interfaceState = new LoginState(this);

    public void operatingSystem(){
        while (true){
            if(bank.getCurrentAccount() == null)
                changeState(new LoginState(this));
            else
                changeState(new LoggedInState(this));

            interfaceState.displayOptions();
            interfaceState.userInteraction();
        }
    }

    private void changeState(InterfaceState interfaceState){
        this.interfaceState = interfaceState;
    }
    public Bank getBank() {
        return bank;
    }



}

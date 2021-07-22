package com.saints;

import com.saints.Bank;
import com.saints.userInterfaceStates.LoggedInStateUser;
import com.saints.userInterfaceStates.LoginStateUser;
import com.saints.userInterfaceStates.UserInterfaceState;

import java.util.Scanner;

public class BankSystemManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final Bank bank = new Bank();
    private UserInterfaceState interfaceState = new LoginStateUser(this);

    public void operatingSystem(){
        while (true){
            if(bank.getCurrentAccount() == null)
                changeState(new LoginStateUser(this));
            else
                changeState(new LoggedInStateUser(this));

            interfaceState.displayOptions();
            interfaceState.userInteraction();
        }
    }

    private void changeState(UserInterfaceState interfaceState){
        this.interfaceState = interfaceState;
    }
    public Bank getBank() {
        return bank;
    }



}

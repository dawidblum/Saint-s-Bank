package com.saints;

import com.saints.interfaceStates.InterfaceState;
import com.saints.interfaceStates.LoggedInState;
import com.saints.interfaceStates.LoginState;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Bank bank = new Bank();
    static InterfaceState interfaceState = new LoginState(bank);

    private static void changeState(InterfaceState state){
        interfaceState = state;
    }

    public static void main(String[] args) {
        boolean shouldcontiune = true;
        int userChoice = 0;


        while (shouldcontiune){
            if(bank.getCurrentAccount() == null)
                changeState(new LoginState(bank));
            else
                changeState(new LoggedInState(bank));

            interfaceState.displayOptions();
            interfaceState.userInteraction();


        }

    }

}

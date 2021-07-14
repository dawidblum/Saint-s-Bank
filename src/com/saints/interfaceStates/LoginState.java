package com.saints.interfaceStates;

import com.saints.Bank;

public class LoginState extends InterfaceState{

    public LoginState(Bank bank) {
        super(bank);
    }

    @Override
    public void displayOptions() {
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");
    }

    @Override
    public void userInteraction() {
        userChoice = scanner.nextInt();

        switch (userChoice){
            case 1 -> bank.signIn();
        }
    }
}

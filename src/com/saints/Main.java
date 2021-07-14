package com.saints;

import com.saints.interfaceStates.InterfaceState;
import com.saints.interfaceStates.LoggedInState;
import com.saints.interfaceStates.LoginState;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Bank bank = new Bank();
    InterfaceState interfaceState = new LoginState(bank);

    private void changeState(InterfaceState interfaceState){
        this.interfaceState = interfaceState;
    }

    public void main(String[] args) {
        boolean shouldcontiune = true;
        int userChoice = 0;


        while (shouldcontiune){
            if(bank.getCurrentAccount() == null)
                changeState(new LoginState(bank));
            else
                changeState(new LoggedInState(bank));

            interfaceState.displayOptions();
            interfaceState.userInteraction();

            if(bank.getCurrentAccount() == null){
                changeState(new LoginState(bank));
                userChoice = scanner.nextInt();



            }
            else{
                Account account = bank.getCurrentAccount();
                accountPage();
                userChoice = scanner.nextInt();
                switch (userChoice){
                    case 1 -> account.deposit(scanner.nextDouble());
                    case 2 -> account.withdraw(scanner.nextDouble());
                    case 3 -> {
                        System.out.println("Enter receiver number");
                        bank.transfer(scanner.nextInt());
                    }
                    case 4 -> account.displayBalance();
                    case 5 -> bank.signOut();
                }
            }


        }

    }

}

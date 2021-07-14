package com.saints;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean shouldcontiune = true;

        int userChoice = 0;

        while (shouldcontiune){
            if(bank.getCurrentAccount() == null){

                loginPage();
                userChoice = scanner.nextInt();

                switch (userChoice){
                    case 1 -> bank.signIn();
                    case 4 -> shouldcontiune = false;}
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
    private static void loginPage (){
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("3. Exit");
    }
    private static void accountPage (){
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Balance");
        System.out.println("5. Logout");
    }
}

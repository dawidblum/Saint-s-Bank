package com.saints;

import com.saints.interfaceStates.BankSystemManagement;
import com.saints.interfaceStates.InterfaceState;
import com.saints.interfaceStates.LoggedInState;
import com.saints.interfaceStates.LoginState;

import java.util.Scanner;

public class Main {
    private static BankSystemManagement bankSystemManagement = new BankSystemManagement();

    public static void main(String[] args) {
        bankSystemManagement.operatingSystem();
    }

}

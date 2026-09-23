package com.epam.prep.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountOperations {
    public static List<Account> accounts = Arrays.asList(
            new Account(12, "adit", 1221.2, 1234, new ArrayList<>()),
            new Account(13, "aditq", 1000, 1239, new ArrayList<>()),
            new Account(14, "adits", 1222.2, 1238, new ArrayList<>()),
            new Account(15, "aditf", 1223.2, 1237, new ArrayList<>()),
            new Account(17, "adith", 1224.2, 1236, new ArrayList<>()),
            new Account(19, "aditu", 1225.2, 1235, new ArrayList<>())
    );

    private static AccountRepository repo;
    AccountOperations(){
        super();
    }
    public static boolean login(int account_num, int pin){
        Account acc = accounts.stream()
                .filter(account -> account.getAcc_num() == account_num)
                .findFirst().get();
        if(acc.getPin() == pin){
            System.out.println("login success");
            return true;
        }else{
            System.out.println("login failed");
        }
        return false;
    }

    public static void withdraw(int acc_num, double amount){
        if(amount<0){
            System.out.println("invalid amount");
            return;
        }
        Account acc = accounts.stream()
                .filter(account -> account.getAcc_num() == acc_num)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Account not found"));
        double bal = acc.getBalance();
        if(bal >= amount){
            bal = bal - amount;
            acc.setBalance(bal);
            System.out.println("withdraw success: "+" current balance: "+ acc.getBalance());
            List<String> newHistory = acc.getHistory();
            newHistory.add("+"+amount+" balance: "+bal);
            acc.setHistory(newHistory);
        }else{
            System.out.println("insufficient balance");
        }

    }

    public static void deposit(int acc_num, double amount){
        if(amount<0){
            System.out.println("invalid amount");
            return;
        }
        Account acc = accounts.stream()
                .filter(account -> account.getAcc_num() == acc_num)
                .findFirst().get();
        double newBalance = acc.getBalance() + amount;
        acc.setBalance(newBalance);
        List<String> newHistory = acc.getHistory();
        newHistory.add("-"+amount+" balance: "+newBalance);
        acc.setHistory(newHistory);
        System.out.println("deposite success new balance = "+acc.getBalance());
    }

    public static void gethistory(int acc_num){
        Account acc = accounts.stream()
                .filter(account -> account.getAcc_num() == acc_num)
                .findFirst().get();
        List<String> history = acc.getHistory();
        System.out.println("Account's : "+acc_num+" history is as follows");
        for(String s: history){
            System.out.println(s);
        }

    }

    public static void main(String[] args){
        //successful login
        login(12, 1234);
//        //fail login

        System.out.println();
        System.out.println();
        login(12, 7654);
////
        System.out.println();
        System.out.println();
////        //successfull withdraw
        withdraw(14, 220);
////        //failed withdraw
        System.out.println();
        System.out.println();
        withdraw(13, 98764);
////        //negative withdra
        System.out.println();
        System.out.println();
        withdraw(13, -3445);
//
//        //deposite success
        System.out.println();
        System.out.println();
        deposit(14, 1212);

        //deposite failed
        System.out.println();
        System.out.println();
        deposit(15, -8374);

        //get history
        System.out.println();
        System.out.println();
        gethistory(14);

    }
}

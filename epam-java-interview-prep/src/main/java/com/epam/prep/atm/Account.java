package com.epam.prep.atm;

import java.util.List;

public class Account {
    private int acc_num;
    private String name;
    private double balance;
    private int pin;

    public Account(int acc_num, String name, double balance, int pin, List<String> history) {
        this.acc_num = acc_num;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.history = history;
    }

    private List<String> history;


    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
}

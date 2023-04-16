package org.example.oop.Hw5.Ex1.service;

import org.example.oop.Hw5.Ex1.model.Bank;
import org.example.oop.Hw5.Ex1.model.User;

public class BankService {
private Bank bank = new Bank();
public void addBankUser(User user) {bank.addBankUser(user);}
    public void deleteBankUser(User user) {bank.deleteBankUser(user);}
    public User getBankUser(User user){return bank.getBankUser(user);}
    public void depositUserBalance(User user, Double deposit) {bank.depositUserBalance(user, deposit);}
    public void takeOffUserBalance(User user, Double takeOff) {bank.takeOffUserBalance(user, takeOff);}
    public void printBankUserList() {bank.printBankUserList();}
}



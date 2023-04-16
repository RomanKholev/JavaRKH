package org.example.oop.Hw5.Ex1.controller;

import org.example.oop.Hw5.Ex1.model.User;
import org.example.oop.Hw5.Ex1.service.BankService;

public class BankController {
    private BankService bankService =new BankService();
    public void addBankUser(User user) {
        bankService.addBankUser(user);
    }
   public void deleteBankUser(User user) {bankService.deleteBankUser(user);}
    public User getBankUser(User user){return bankService.getBankUser(user);}
    public void depositUserBalance(User user, Double deposit) {bankService.depositUserBalance(user, deposit);}
    public void takeOffUserBalance(User user, Double takeOff) {bankService.takeOffUserBalance(user, takeOff);}
    public void printBankUserList() {bankService.printBankUserList();}
}

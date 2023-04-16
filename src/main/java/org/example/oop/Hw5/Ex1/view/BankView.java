package org.example.oop.Hw5.Ex1.view;

import org.example.oop.Hw5.Ex1.controller.BankController;
import org.example.oop.Hw5.Ex1.model.User;

public class BankView {
    public static void main(String[] args) {
        BankController bankController = new BankController();
        User user1 = new User(1, "User 1", 110.0);
        User user2 = new User(2, "User 2", 120.0);
        User user3 = new User(3, "User 3", 130.0);
        User user4 = new User(4, "User 4", 140.0);
        bankController.addBankUser(user1);
        bankController.addBankUser(user2);
        bankController.addBankUser(user3);
        bankController.addBankUser(user4);
        bankController.printBankUserList();
        System.out.println("------");
        bankController.deleteBankUser(user3);
        bankController.printBankUserList();
        bankController.depositUserBalance(user1, 100.0);
        user1.showBalance();
        bankController.takeOffUserBalance(user2, 130.0);
        user2.showBalance();
        bankController.takeOffUserBalance(user2, 10.0);
        user2.showBalance();
    }
}
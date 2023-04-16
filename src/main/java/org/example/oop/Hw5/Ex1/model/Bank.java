package org.example.oop.Hw5.Ex1.model;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bank {
    private List<User> bankUserList = new ArrayList<>();
    public Bank (List<User> userList) {this.bankUserList = new LinkedList<User>();}

    public Bank() {
    }

    public void addBankUser(User user) {
        bankUserList.add(user);
    }
    public void deleteBankUser(User user){
        bankUserList.remove(user);
    }
    public User getBankUser(User user){
        for (User el: bankUserList){
            if (el.getUserId().equals(user.getUserId())){
                return el;
            }
        }
        return null;
    }
    public void depositUserBalance(User user, Double deposit) {
        user.setUserBalance(user.getUserBalance() + deposit); ;
    }
public void takeOffUserBalance(User user, Double takeOff){
        if (user.getUserBalance()>takeOff) {
            user.setUserBalance(user.getUserBalance() - takeOff);
        }
        else {
            System.out.println("недостаточно средств");
        }
}
    public void printBankUserList(){
        for (User user : bankUserList) {
            System.out.println(user);
           }

    }
}
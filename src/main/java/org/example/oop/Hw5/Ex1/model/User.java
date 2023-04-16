package org.example.oop.Hw5.Ex1.model;

public class User {
    private Integer userId;
    private String userName;
    private Double userBalance;

    public User(Integer userId, String userName, Double userBalance) {
        this.userId = userId;
        this.userName = userName;
        this.userBalance = userBalance;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Double userBalance) {
        this.userBalance = userBalance;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userBalance=" + userBalance +
                '}';
    }
public void showBalance(){
    System.out.printf("User: %d %s balance: %s\n",userId,userName,userBalance);
}
}

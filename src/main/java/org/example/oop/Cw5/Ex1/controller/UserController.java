package org.example.oop.Cw5.Ex1.controller;


import org.example.oop.Cw5.Ex1.model.User;
import org.example.oop.Cw5.Ex1.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(int userID, String name, int age){
        userService.saveUser(new User(userID,name, age));
    }
    public  void deleteFromRepo(User user){
        userService.deleteFromRepo(user);
    }
    public User getUserFromRepo(User user){
        return userService.getUserFromRepo(user);
    }
    public void addUserToRepo(User user){
        userService.addToRepo(user);
    }

}

package org.example.oop.Cw5.Ex1.view;

import org.example.oop.Cw5.Ex1.controller.UserController;
import org.example.oop.Cw5.Ex1.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter ur data");
        userController.saveNewUser(scanner.nextInt(), scanner.next(),scanner.nextInt());
        User user = new User(1,"asd", 12);
        userController.addUserToRepo(user);
        System.out.println(userController.getUserFromRepo(user));
        userController.deleteFromRepo(user);
        System.out.println(userController.getUserFromRepo(user));

    }
}

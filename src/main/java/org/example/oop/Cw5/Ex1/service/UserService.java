package org.example.oop.Cw5.Ex1.service;

import org.example.oop.Cw5.Ex1.model.User;
import org.example.oop.Cw5.Ex1.repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

    public void deleteFromRepo(User user){
    userRepo.deleteFromRepo(user);
}
public User getUserFromRepo(User user){
       return userRepo.getUserFromRepo(user);

}
    public void addToRepo(User user){
        userRepo.addToRepo(user);
    }
}
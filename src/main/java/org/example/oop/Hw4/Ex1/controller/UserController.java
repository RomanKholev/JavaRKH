package org.example.oop.Hw4.Ex1.controller;

import org.example.oop.Hw4.Ex1.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}

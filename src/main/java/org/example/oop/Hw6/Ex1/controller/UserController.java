package org.example.oop.Hw6.Ex1.controller;

import org.example.oop.Hw6.Ex1.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}

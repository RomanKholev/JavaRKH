package org.example.oop.Hw4.Ex1.view;

import org.example.oop.Hw4.Ex1.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}

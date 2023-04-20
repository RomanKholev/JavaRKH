package org.example.oop.Hw6.Ex1.view;

import org.example.oop.Hw6.Ex1.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}

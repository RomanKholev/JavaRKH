package org.example.oop.Hw6.Ex1.service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);

    public Long getId(T user);
    public Long getMaxId();

    public default Long getMaxId(List<T> users){
        Long countMaxId = 0L;
        for (T user: users){
            if (getId(user) > countMaxId){
                countMaxId = getId(user);
            }
        }
        return countMaxId;
    }
}
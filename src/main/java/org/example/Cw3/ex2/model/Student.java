package org.example.Cw3.ex2.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor


public class Student {
    private String surname;
    private int groupNumber;
    private double money;
    private List<Integer> evolution;

}

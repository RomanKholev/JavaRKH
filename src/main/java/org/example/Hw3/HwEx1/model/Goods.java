package org.example.Hw3.HwEx1.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {

    private String name;
    private Double prise;
    private Integer grade;
}
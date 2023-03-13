package org.example.Hw3.HwEx2.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {

    private String name;
    private String country;
    private Double price;
    private Double weight;
    private Integer grade;
}
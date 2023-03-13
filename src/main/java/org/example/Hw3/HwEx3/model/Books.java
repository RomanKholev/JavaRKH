package org.example.Hw3.HwEx3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {

    private String name;
    private String author;
    private Double price;
    private Integer pages;
    private Integer year;
}

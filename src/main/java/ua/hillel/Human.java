package ua.hillel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Human {

    private String name;
    private String surName;
    private String country;
    private int age;
}

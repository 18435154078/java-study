package com.test_08_14.team.domain;

public class Architect extends Designer{
    private double stock;

    public Architect() {}

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, double stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }
}

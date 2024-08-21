package com.test_07_22.Interface.exp3;

public class Bicycle extends Vehicle{
    public Bicycle() { }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("骑自行车");
    }
}

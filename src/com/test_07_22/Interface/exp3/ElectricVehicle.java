package com.test_07_22.Interface.exp3;

import java.sql.SQLOutput;

public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车");
    }

    @Override
    public void power() {
        System.out.println("电动车耗电");
    }
}

package com.test_07_22.Interface.exp3;

public class Car extends Vehicle implements IPower {
    private int carnum;
    public Car() {
    }

    public Car(String brand, String color, int carnum) {
        super(brand, color);
        this.carnum = carnum;
    }

    public int getCarnum() {
        return carnum;
    }

    public void setCarnum(int carnum) {
        this.carnum = carnum;
    }

    @Override
    public void run() {
        System.out.println("开车");
    }

    @Override
    public void power() {
        System.out.println("汽车耗油");
    }
}

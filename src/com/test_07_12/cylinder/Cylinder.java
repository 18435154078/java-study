package com.test_07_12.cylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {}

    public Cylinder(double radius ,double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * super.area();
    }
    @Override
    public double area() {
        return super.area() * 2 + this.length() * this.height;
    }
    @Override // 重写
    public void say() {
        System.out.println("Cylinder：" + getVolume());
    }
}
